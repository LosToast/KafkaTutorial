package com.example.kafka_tutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Config {

    @Bean
    public NewTopic kafkaTopic(){
        return TopicBuilder
                .name("topic1")
                .build();
    }
}
