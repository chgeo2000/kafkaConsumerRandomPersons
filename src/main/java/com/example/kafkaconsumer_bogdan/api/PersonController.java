package com.example.kafkaconsumer_bogdan.api;

import com.example.kafkaconsumer_bogdan.domain.Person;
import com.example.kafkaconsumer_bogdan.repository.PersonRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonRepository personRepository;

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personRepository.save(person);
    }

    @GetMapping
    public Iterable<Person> findAllPersons(){
        return personRepository.findAll();
    }


}
