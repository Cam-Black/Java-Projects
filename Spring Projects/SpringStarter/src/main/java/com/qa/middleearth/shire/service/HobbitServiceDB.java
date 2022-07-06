package com.qa.middleearth.shire.service;

import com.qa.middleearth.shire.Hobbit;
import com.qa.middleearth.shire.repository.HobbitRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class HobbitServiceDB implements HobbitService {

    private HobbitRepo repo;

    public HobbitServiceDB(HobbitRepo repo) {
        this.repo = repo;
    }

    @Override
    public Hobbit getAHobbit(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Hobbit> getAllHobbits() {
        return repo.findAll();
    }

    @Override
    public Hobbit createHobbit(Hobbit hobbit) {
        return repo.save(hobbit);
    }

    @Override
    public Hobbit updateHobbit(int id, String forename, String familyName, int age) {
        Hobbit toUpdate = repo.findById(id).get();
        toUpdate.setForename(forename);
        toUpdate.setFamilyName(familyName);
        toUpdate.setAge(age);
        return repo.save(toUpdate);
    }

    @Override
    public void deleteHobbit(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Hobbit> findHobbitByFamilyName(String familyName) {
        return repo.findHobbitByFamilyName(familyName);
    }
}
