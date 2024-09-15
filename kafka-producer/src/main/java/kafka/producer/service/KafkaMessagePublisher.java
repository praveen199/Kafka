package kafka.producer.service;

import kafka.producer.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, Object> template;

    public void sendMessageToTopic(String message) {
        CompletableFuture<SendResult<String, Object>> completableFuture = template.send("partitionMessageTopic",1,null, message);
        completableFuture.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" + message + "] due to : " + ex.getMessage());
            }
        });
    }

    /*public void sendEventsToTopic(Customer customer) {
        CompletableFuture<SendResult<String, Object>> completableFuture = template.send("third_topic", customer);
        completableFuture.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + customer + "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" + customer + "] due to : " + ex.getMessage());
            }
        });
    }*/
}