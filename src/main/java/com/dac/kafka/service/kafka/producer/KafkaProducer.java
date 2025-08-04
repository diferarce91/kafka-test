package com.dac.kafka.service.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.dac.kafka.model.IPublishable;

@Service
public class KafkaProducer{

    @Autowired
    private KafkaTemplate<String, IPublishable> kafkaTemplate;

    public void sendMessage(String topic, IPublishable data) {
        this.kafkaTemplate.send(topic, data);
    }
}
