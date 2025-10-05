package com.example.kafka_tutorial.controller;

import com.example.kafka_tutorial.producer.Producer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessaageController {

    private Producer producer;

    public MessaageController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publicshMessage(@RequestParam("message") String Message){
        producer.sendMessage(Message);
        return ResponseEntity.ok("Message sent to topic");
    }
}
