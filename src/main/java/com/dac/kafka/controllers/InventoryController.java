package com.dac.kafka.controllers;

import com.dac.kafka.model.ProductSelled;
import com.dac.kafka.service.kafka.producer.ProductProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
