package com.spring.kafka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

  private final KafkaProducer producerService;

  public KafkaController(KafkaProducer producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/send")
  public String sendMessage(@RequestBody UserEvent event) {
    producerService.send(event);
    return "Event sent: " + event;
  }
}