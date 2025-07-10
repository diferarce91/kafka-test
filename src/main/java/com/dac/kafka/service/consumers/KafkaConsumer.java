package com.dac.kafka.service.consumers;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {


    @KafkaListener(topics = "ventastopic")
    public void listen(String message) {
        System.out.println("Mensaje recibido: " + message);
    }

}
