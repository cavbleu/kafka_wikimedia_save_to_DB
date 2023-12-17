package com.dmitriy.kh.kafka_test_produser;

import com.dmitriy.kh.kafka_test_produser.services.WikimediaChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaTestProduserApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestProduserApplication.class, args);
    }

    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;

    @Override
    public void run(String... arg) throws Exception{
        wikimediaChangesProducer.sendMessage();
    }

}
