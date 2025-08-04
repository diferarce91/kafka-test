package com.dac.kafka.service.kafka.consumers;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.dac.kafka.model.IReadable;

@Configuration
public class ProductSelledConsumer {

    //@KafkaListener(topics = "ventastopic")
    public void listen(IReadable message) {
        System.out.println("Mensaje recibido: " + message);
    }

}
