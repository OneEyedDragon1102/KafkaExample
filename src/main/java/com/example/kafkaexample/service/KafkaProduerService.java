package com.example.kafkaexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProduerService {
    private static final String TOPIC = "ExampleTopic";
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Logger LOG = LoggerFactory.getLogger(KafkaProduerService.class);

    public KafkaProduerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
        LOG.info("Message sent to topic: " + message);
    }
}
