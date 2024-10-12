package com.gwc.pong.repository;

import com.gwc.pong.model.KafkaMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaMessageRepository extends JpaRepository<KafkaMessage, Integer> {
}
