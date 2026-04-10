package com.spring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "user-topic", groupId = "group-1")
  public void consume(UserEvent event) {

    System.out.println("Processing: " + event.getUserId());

    // Simulate failure
    if ("fail".equals(event.getAction())) {
      throw new RuntimeException("Error processing event");
    }

    System.out.println("Processed successfully");
  }
}