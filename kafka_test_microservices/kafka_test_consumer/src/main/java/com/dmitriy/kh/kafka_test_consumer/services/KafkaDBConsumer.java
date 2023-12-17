package com.dmitriy.kh.kafka_test_consumer.services;

import com.dmitriy.kh.kafka_test_consumer.entity.WikimediaData;
import com.dmitriy.kh.kafka_test_consumer.repository.WikimediaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author cavbleu
 * @project kafka_test_microservices
 * @create 2023-12-17 17:56
 */

@Service
public class KafkaDBConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDBConsumer.class);

    private WikimediaRepository dataRepository;

    public KafkaDBConsumer(WikimediaRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(String eventMessage){

        LOGGER.info(String.format("Event message received -> %s", eventMessage));

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);

        dataRepository.save(wikimediaData);
    }
}
