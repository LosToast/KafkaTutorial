package com.example.kafka_tutorial.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "topic1" , groupId = "myGroup")
    public void consume(String Message){
        logger.info(String.format("Message Recived %s" , Message));
    }
}
