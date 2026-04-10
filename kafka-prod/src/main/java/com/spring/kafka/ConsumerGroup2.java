package com.spring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerGroup2 {

  @KafkaListener(topics = "my-topic", groupId = "group-2")
  public void listen(String message) {
    System.out.println("Group 2 received: " + message);
  }
}
