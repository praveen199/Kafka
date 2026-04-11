package com.spring.kafka.consumer;

import com.spring.kafka.event.UserEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

  @KafkaListener(topics = "mytopic", groupId = "group-1")
  public void consume(UserEvent event) {
    System.out.println("Received Order: " + event.getOrderId());

    // Business failure simulation
    if (event.getQuantity() < 0) {
      throw new RuntimeException("Invalid quantity!");
    }
  }
}
