package com.qa.springstarter.service;

import com.qa.springstarter.shire.Hobbit;

import java.util.List;

public interface HobbitService {
    Hobbit getAHobbit(int id);

    List<Hobbit> getAllHobbits();

    Hobbit createHobbit(Hobbit hobbit);

    Hobbit updateHobbit(int id, String forename, String familyName, int age);

    void deleteHobbit(int id);

    List<Hobbit> findHobbitByFamilyName(String familyName);
}