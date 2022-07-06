package com.qa.springstarter.middleearth.shire.controller;

import com.qa.springstarter.middleearth.shire.Hobbit;
import com.qa.springstarter.middleearth.shire.service.HobbitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class HobbitController {

    private HobbitService service;

    public HobbitController(HobbitService service) {
        this.service = service;
    }

    @PostMapping("/hobbit/create")
    public ResponseEntity<Hobbit> createHobbit(@RequestBody Hobbit hobbit) {
        Hobbit created = service.createHobbit(hobbit);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/hobbit/list-hobbits")
    public List<Hobbit> getHobbits() {
        return service.getAllHobbits();
    }

    @GetMapping("/hobbit/list-hobbit/{id}")
    public Hobbit getHobbit(@PathVariable("id") int id) {
        return service.getAHobbit(id);
    }

    @PatchMapping("/hobbit/update/{id}")
    public Hobbit updateHobbit(@PathVariable("id") int id, @PathParam("forename") String forename,
                               @PathParam("familyName") String familyName, @PathParam("age") int age) {
        return service.updateHobbit(id, forename, familyName, age);
    }

    @DeleteMapping("/hobbit/delete/{id}")
    public ResponseEntity<?> deleteHobbit(@PathVariable("id") int id) {
        service.deleteHobbit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/hobbit/findFamilies/")
    public List<Hobbit> getHobbitFamilies(@PathParam("familyName") String familyName) {
        return service.findHobbitByFamilyName(familyName);
    }
}