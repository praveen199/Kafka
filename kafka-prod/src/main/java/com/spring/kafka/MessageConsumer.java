/*
package com.spring.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

  @KafkaListener(topics = "my-topic", groupId = "my-group")
  public void consume(UserEvent event) {
    System.out.println("Received event:");
    System.out.println("UserId: " + event.getUserId());
    System.out.println("Action: " + event.getAction());

    //UserEvent obj = new ObjectMapper().readValue(event, UserEvent.class);
  }
}
*/
