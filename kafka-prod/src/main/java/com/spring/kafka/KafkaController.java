package com.spring.kafka;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

  private final MessageProducer producerService;

  public KafkaController(MessageProducer producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/send")
  public String sendMessage(@RequestParam String message) {
    producerService.sendMessage(message);
    return "Event sent: " + message;
  }
}