package com.example.kafkaexample.controller;

import com.example.kafkaexample.service.KafkaProduerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final KafkaProduerService kafkaProduerService;

    public KafkaController(KafkaProduerService kafkaProduerService) {
        this.kafkaProduerService = kafkaProduerService;
    }

    @GetMapping("/send")
    public String message(@RequestParam String message){
        kafkaProduerService.sendMessage(message);

        return "Message send successfully";
    }
}
