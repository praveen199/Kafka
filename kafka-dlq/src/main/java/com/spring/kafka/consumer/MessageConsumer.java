package com.spring.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

  @KafkaListener(topics = "mytopic", groupId = "group-1")
  public void consume(String message) {
    System.out.println("Received: " + message);

    if (message.contains("fail")) {
      throw new RuntimeException("Simulated failure!");
    }
  }
}
