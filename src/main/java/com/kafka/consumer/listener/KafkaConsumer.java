package com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "TEST_TOPIC", groupId = "group_id")
    public void consume(String message)
    {
        System.out.println("message = " + message);
    }
}
