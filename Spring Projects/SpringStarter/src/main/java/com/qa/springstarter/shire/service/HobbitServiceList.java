package com.qa.springstarter.shire.service;

import com.qa.springstarter.service.HobbitService;
import com.qa.springstarter.shire.Hobbit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HobbitServiceList implements HobbitService {
    private List<Hobbit> hobbits = new ArrayList<>();

    @Override
    public Hobbit getAHobbit(int id) {
        return hobbits.get(id);
    }

    @Override
    public List<Hobbit> getAllHobbits() {
        return hobbits;
    }

    @Override
    public Hobbit createHobbit(Hobbit hobbit) {
        this.hobbits.add(hobbit);
        return this.hobbits.get(this.hobbits.size() - 1);
    }

    @Override
    public Hobbit updateHobbit(int id, String forename, String familyName, int age) {
        Hobbit updated = hobbits.get(id);
        updated.setForename(forename);
        updated.setFamilyName(familyName);
        updated.setAge(age);
        return updated;
    }

    @Override
    public void deleteHobbit(int id) {
        hobbits.remove(id);
    }

    @Override
    public List<Hobbit> findHobbitByFamilyName(String forename) {
        return null;
    }
}
