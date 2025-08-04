package com.dac.kafka.service.kafka.producer;

import org.springframework.stereotype.Service;

import com.dac.kafka.model.IPublishable;

@Service
public class ProductProducer extends KafkaProducer{

    private final String TOPIC = "ventastopic";

    public void publish(IPublishable publishable){
        this.sendMessage(TOPIC, publishable);
    }
}
