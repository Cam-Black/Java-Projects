package com.qa.middleearth.shire.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.middleearth.shire.Hobbit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = {"classpath:hobbit-schema.sql",
        "classpath:hobbit-data.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
public class HobbitControllerIntegrationTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void testCreate() throws Exception {
        Hobbit testHobbit = new Hobbit("Frodo", "Baggins", 50);
        String testHobbitAsJSON = this.mapper.writeValueAsString(testHobbit);
        Hobbit createdHobbit = new Hobbit(2, "Frodo", "Baggins", 50);
        String createdHobbitAsJSON = this.mapper.writeValueAsString(createdHobbit);

        this.mvc.perform(post("/hobbit/create")
                        .content(testHobbitAsJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json(createdHobbitAsJSON));
    }

    @Test
    void testGetHobbits() throws Exception {
        List<Hobbit> hobbits = new ArrayList<>();
        hobbits.add(new Hobbit(1, "Bilbo", "Baggins", 150));
        String listToJSON = this.mapper.writeValueAsString(hobbits);
        this.mvc.perform(get("/hobbit/list-hobbits")).andExpect(content().json(listToJSON))
                .andExpect(status().isOk());
    }

    @Test
    void testGetAHobbit() throws Exception {
        Hobbit hobbit = new Hobbit(1, "Bilbo", "Baggins", 150);
        String hobbitToJSON = this.mapper.writeValueAsString(hobbit);
        this.mvc.perform(get("/hobbit/list-hobbit/1")).andExpect(content().json(hobbitToJSON))
                .andExpect(status().isOk());
    }

    @Test
    void testUpdate() throws Exception {
        Hobbit updatedHobbit = new Hobbit(1, "Scarlet", "Baggins", 150);
        String toJSON = this.mapper.writeValueAsString(updatedHobbit);
        this.mvc.perform(patch("/hobbit/update/1?forename=Scarlet&familyName=Baggins&age=150"))
                .andExpect(content().json(toJSON)).andExpect(status().isOk());
    }

    @Test
    void testDelete() throws Exception {
        this.mvc.perform(delete("/hobbit/delete/1")).andExpect(status().isNoContent());
    }

    @Test
    void testGetByFamilyName() throws Exception {
        List<Hobbit> baggins = new ArrayList<>();
        baggins.add(new Hobbit(1, "Bilbo", "Baggins", 150));
        String bagginsToJSON = this.mapper.writeValueAsString(baggins);
        this.mvc.perform(get("/hobbit/findFamilies/?familyName=Baggins"))
                .andExpect(content().json(bagginsToJSON))
                .andExpect(status().isOk());
    }
}