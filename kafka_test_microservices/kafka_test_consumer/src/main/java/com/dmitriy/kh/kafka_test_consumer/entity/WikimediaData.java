package com.dmitriy.kh.kafka_test_consumer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author cavbleu
 * @project kafka_test_microservices
 * @create 2023-12-17 18:00
 */

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String wikiEventData;


}
