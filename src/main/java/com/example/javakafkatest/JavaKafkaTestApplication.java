package com.example.javakafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaKafkaTestApplication {

    private final KafkaProducerService kafkaProducerService;

    @Autowired
    public JavaKafkaTestApplication(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaKafkaTestApplication.class, args);
    }

    @PostMapping("/messages")
    public void sendMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
    }

}
