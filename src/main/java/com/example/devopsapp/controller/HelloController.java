package com.example.devopsapp.controller;

import com.example.devopsapp.entity.Person;
import com.example.devopsapp.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final PersonRepository personRepository;

    public HelloController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/hello")
    public String hello() {
        Person person = personRepository.findAll().get(0);
        return "Hello, " + person.getName() + "!";
    }
}