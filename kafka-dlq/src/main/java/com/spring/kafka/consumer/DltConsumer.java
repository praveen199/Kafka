package com.spring.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DltConsumer {

  @KafkaListener(topics = "main-topic-dlt", groupId = "dlt-group")
 /* public void consumeDlt(String message) {
    System.out.println("DLQ Received: " + message);
  }*/

  /**
   * This method is used to consume DLT (Dead Letter Topic) messages
   * It handles messages that have previously failed during processing.
   */
  public void consumeDlt(ConsumerRecord<String, String> record) {

    System.out.println("DLQ MESSAGE: " + record.value());

    // Useful debug headers
    System.out.println("ERROR: " +
        record.headers().lastHeader("kafka_dlt-exception-message"));

    System.out.println("ORIGINAL TOPIC: " +
        record.headers().lastHeader("kafka_dlt-original-topic"));
  }
}
