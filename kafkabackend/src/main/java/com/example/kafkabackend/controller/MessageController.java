package com.example.kafkabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkabackend.services.KafkaConsumerService;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private KafkaConsumerService kafkaConsumerService;
    @GetMapping("/all")
    public ResponseEntity<List<String>> getAllMessages() {
        return ResponseEntity.ok(kafkaConsumerService.getMessages());
    }
}
