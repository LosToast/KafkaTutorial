package com.example.kafka_tutorial.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    public static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
    private KafkaTemplate<String , String> kafkaTemplate;

    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent %s" , message));
        kafkaTemplate.send("topic1" , message);
    }
}
