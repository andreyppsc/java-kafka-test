package com.example.javakafkatest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "quickstart")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}
