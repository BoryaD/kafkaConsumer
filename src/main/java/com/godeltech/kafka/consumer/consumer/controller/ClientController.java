package com.godeltech.kafka.consumer.consumer.controller;


import com.godeltech.kafka.consumer.consumer.entity.Client;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@EnableKafka
public class ClientController {
    @KafkaListener(topics="clients")
    public void orderListenerClients(ConsumerRecord<Long, Client> record){
        System.out.println(record.partition());
        System.out.println(record.key());
        System.out.println(record.value());
    }
}
