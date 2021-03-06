package com.example.frontend;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.frontend.deo.PersonRepository;
import com.example.frontend.model.person;

@SpringBootApplication
public class PersonBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersonBackendApplication.class, args);
	}

	@Autowired
	PersonRepository personRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		personRepo.save(new person("tom","cruise",3,"haihso"));
	}

}
