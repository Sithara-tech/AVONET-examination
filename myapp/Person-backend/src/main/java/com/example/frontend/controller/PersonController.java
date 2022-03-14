package com.example.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frontend.deo.PersonRepository;
import com.example.frontend.model.person;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class PersonController {
	
	@Autowired
	PersonRepository personRepo;
	
	@GetMapping("/personslist")
	public List<person> listofPersons() {
		
	return personRepo.findAll();
		
	}
}