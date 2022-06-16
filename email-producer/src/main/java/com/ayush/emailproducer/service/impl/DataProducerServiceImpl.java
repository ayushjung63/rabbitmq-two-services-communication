package com.ayush.emailproducer.service.impl;


import com.ayush.emailproducer.entities.Data;
import com.ayush.emailproducer.service.DataProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataProducerServiceImpl implements DataProducerService {
    private static  final String EXCHANGE="exchange";
    private static  final String ROUTING_KEY="queue.routing.key";

    @Autowired
    private RabbitTemplate  rabbitTemplate;


    @Override
    public void produce(Data data) throws Exception {
        rabbitTemplate.convertAndSend(EXCHANGE,ROUTING_KEY,data);
    }
}
