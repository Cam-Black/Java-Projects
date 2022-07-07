package com.qa.middleearth.shire.repository;

import com.qa.middleearth.shire.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HobbitRepo extends JpaRepository<Hobbit, Integer> {
    List<Hobbit> findHobbitByFamilyName(String familyName);
}