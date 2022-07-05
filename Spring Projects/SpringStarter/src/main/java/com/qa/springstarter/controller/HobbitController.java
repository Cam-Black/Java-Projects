package com.qa.springstarter.controller;

import com.qa.springstarter.shire.Hobbit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HobbitController {

    List<Hobbit> hobbits = new ArrayList<>();

    @PostMapping("/hobbit/create")
    public ResponseEntity<Hobbit> createHobbit(@RequestBody Hobbit hobbit) {
        this.hobbits.add(hobbit);
        Hobbit created = this.hobbits.get(this.hobbits.size() - 1);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/hobbit/list-hobbits")
    public ResponseEntity<List<Hobbit>> getHobbits() {
        return new ResponseEntity<>(hobbits, HttpStatus.OK);
    }

    @GetMapping("/hobbit/list-hobbit/{id}")
    public ResponseEntity<Hobbit> getHobbit(@PathVariable("id") int id) {
        Hobbit myHobbit = this.hobbits.get(id);
        return new ResponseEntity<>(myHobbit, HttpStatus.OK);
    }

    @PatchMapping("hobbit/update/{id}")
    public Hobbit updateHobbit(@PathVariable("id") int id, @PathParam("forename") String forename,
                               @PathParam("familyName") String familyName, @PathParam("age") int age) {
        Hobbit updatedHobbit = hobbits.get(id);
        updatedHobbit.setForename(forename);
        updatedHobbit.setFamilyName(familyName);
        updatedHobbit.setAge(age);
        return updatedHobbit;
    }

    @DeleteMapping("hobbit/delete/{id}")
    public ResponseEntity<?> deleteHobbit(@PathVariable("id") int id) {
        hobbits.remove(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}