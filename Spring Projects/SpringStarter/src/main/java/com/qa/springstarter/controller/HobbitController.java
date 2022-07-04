package com.qa.springstarter.controller;

import com.qa.springstarter.shire.Hobbit;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
public class HobbitController {

    ArrayList<Hobbit> hobbits = new ArrayList<>();

    @PostMapping("/hobbit/create")
    public Hobbit createHobbit(@RequestBody Hobbit hobbit) {
        this.hobbits.add(hobbit);
        return this.hobbits.get(this.hobbits.size() - 1);
    }

    @GetMapping("/hobbit/list-hobbits")
    public ArrayList<Hobbit> getHobbits() {
        return hobbits;
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
    public String deleteHobbit(@PathVariable("id") int id) {
        Hobbit deletedHobbit = hobbits.get(id);
        hobbits.remove(id);
        return deletedHobbit + ": Deleted" ;
    }
}

