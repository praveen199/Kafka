package com.spring.kafka.controller;


import com.spring.kafka.producer.MessageProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

  private final MessageProducer producerService;

  public KafkaController(MessageProducer producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/send")
  public String sendMessage(@RequestBody String event) {
    producerService.send(event);
    return "Event sent: " + event;
  }
}
