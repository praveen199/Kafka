package com.spring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerA {

  @KafkaListener(topics = "my-topic", groupId = "group-1")
  public void listen(String message) {
    System.out.println("Consumer A received: " + message);
  }
}
