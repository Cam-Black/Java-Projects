package com.qa.middleearth.shire.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.middleearth.shire.Hobbit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
public class HobbitControllerIntegrationTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void testCreate() throws Exception {
        Hobbit testHobbit = new Hobbit("Frodo", "Baggins", 50);
        String testHobbitAsJSON = this.mapper.writeValueAsString(testHobbit);
        RequestBuilder req = post("/hobbit/create")
                .content(testHobbitAsJSON)
                .contentType(MediaType.APPLICATION_JSON);
        ResultMatcher checkStatus = MockMvcResultMatchers.status().is(201);
        Hobbit createdHobbit = new Hobbit(1, "Frodo", "Baggins", 50);
        String createdDinoAsJSON = this.mapper.writeValueAsString(createdHobbit);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(createdDinoAsJSON);

        this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
    }
}
