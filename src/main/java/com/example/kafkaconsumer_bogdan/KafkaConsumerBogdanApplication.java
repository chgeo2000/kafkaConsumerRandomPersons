package com.example.kafkaconsumer_bogdan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.kafkaconsumer_bogdan"})
public class KafkaConsumerBogdanApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerBogdanApplication.class, args);
    }

}
