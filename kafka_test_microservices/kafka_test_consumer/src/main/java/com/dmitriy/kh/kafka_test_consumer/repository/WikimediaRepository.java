package com.dmitriy.kh.kafka_test_consumer.repository;

import com.dmitriy.kh.kafka_test_consumer.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cavbleu
 * @project kafka_test_microservices
 * @create 2023-12-17 17:59
 */
public interface WikimediaRepository extends JpaRepository<WikimediaData, Long> {
}
