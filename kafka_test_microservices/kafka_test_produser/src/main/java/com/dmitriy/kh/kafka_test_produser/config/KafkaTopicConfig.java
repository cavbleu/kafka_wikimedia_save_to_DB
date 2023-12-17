package com.dmitriy.kh.kafka_test_produser.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author cavbleu
 * @project kafka_test_microservices
 * @create 2023-12-17 15:09
 */

@Configuration
public class KafkaTopicConfig {


    @Value("${spring.kafka.topic.name}")
    private String topic;

    @Bean
    public NewTopic topic ()
    {return TopicBuilder.name(topic)
            .build();
    }
}
