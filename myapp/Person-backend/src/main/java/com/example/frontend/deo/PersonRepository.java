package com.example.frontend.deo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.frontend.model.person;

@Repository
public interface PersonRepository extends JpaRepository<person, Long> {

}
