package com.example.kafka_tutorial.controller;

import com.example.kafka_tutorial.payload.User;
import com.example.kafka_tutorial.producer.JsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/json")
public class JsonMessageController {
    private JsonProducer jsonProducer;

    public JsonMessageController(JsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message Sent to Kafka");

    }
}
