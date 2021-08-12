package com.example.kafkaconsumer_bogdan.listener;

import com.example.kafkaconsumer_bogdan.domain.Person;
import com.example.kafkaconsumer_bogdan.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class KafkaConsumer {

    private final PersonRepository personRepository;

    @KafkaListener(topics = "persons", groupId = "group_id")
    public void consume(List<Person> persons){

        personRepository.saveAll(persons);
    }
}
