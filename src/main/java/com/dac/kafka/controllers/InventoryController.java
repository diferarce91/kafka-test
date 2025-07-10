package com.dac.kafka.controllers;

import com.dac.kafka.service.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1/kafka")
public class InventoryController {

    @Autowired
    private KafkaProducer kafkaProducer;

    public KafkaProducer getKafkaProducer() {
        return kafkaProducer;
    }

    @RequestMapping("/publish")
    public ResponseEntity publish(@RequestParam String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to topic ");
    }
}
