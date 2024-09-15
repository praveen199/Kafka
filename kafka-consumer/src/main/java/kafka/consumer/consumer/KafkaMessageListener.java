package kafka.consumer.consumer;

import kafka.consumer.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

  Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

  @KafkaListener(topics = "partitionMessageTopic", groupId = "partition-per-messsage-topic")
  public void consume(String message) {
    log.info("consumer2 consume the message {} " + message);
  }

  /*@KafkaListener(topics = "second_topic", groupId = "group-id")
  public void consume1(String message) {
    log.info("consumer2 consume the message {} " + message);
  }

  @KafkaListener(topics = "second_topic", groupId = "group-id")
  public void consume2(String message) {
    log.info("consumer2 consume the message {} " + message);
  }

  @KafkaListener(topics = "second_topic", groupId = "group-id")
  public void consume3(String message) {
    log.info("consumer2 consume the message {} " + message);
  }*/

  /*@KafkaListener(topics = "third_topic",groupId = "group-id")
  public void consumeEvents(Customer customer) {
    log.info("consumer consume the events {} ", customer.toString());
  }*/
}
