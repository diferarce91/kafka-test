package com.dac.kafka.controllers;

import com.dac.kafka.model.ProductSelled;
import com.dac.kafka.service.producer.KafkaProducer;
import com.dac.kafka.service.producer.ProductProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1/kafka")
public class InventoryController {

    @Autowired
    private ProductProducer productProducer;

    @PostMapping("/publish")
    public ResponseEntity publish(@RequestBody ProductSelled productSelled) {
        productProducer.publish(productSelled);
        return ResponseEntity.ok("Message sent to topic ");
    }
}
