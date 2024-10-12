package com.gwc.pong.listener;

import com.gwc.pong.model.KafkaMessage;
import com.gwc.pong.repository.KafkaMessageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class KafkaListenerService {

    private final KafkaMessageRepository repository;

    @KafkaListener(topics = "pinged_endpoint")
    public void listen(ConsumerRecord<String, String> record) {
        log.info("Saving message from KAFKA: {}", record.toString());

        KafkaMessage kafkaMessage = KafkaMessage.builder()
                .msg(record.value())
                .topic(record.topic())
                .build();

        repository.save(kafkaMessage);
    }
}
