package com.spring.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

  private final KafkaTemplate<String, UserEvent> kafkaTemplate;

  public KafkaProducer(KafkaTemplate<String, UserEvent> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void send(UserEvent event) {
    kafkaTemplate.send("user-topic", event);
  }
}
