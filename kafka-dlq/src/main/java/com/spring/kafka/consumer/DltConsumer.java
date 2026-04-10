package com.spring.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DltConsumer {

  @KafkaListener(topics = "main-topic-dlt", groupId = "dlt-group")
  public void consumeDlt(String message) {
    System.out.println("DLQ Received: " + message);
  }
}
