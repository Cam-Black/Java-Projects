package com.qa.springstarter.shire.repository;

import com.qa.springstarter.shire.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbitRepo extends JpaRepository<Hobbit, Integer> {
}
