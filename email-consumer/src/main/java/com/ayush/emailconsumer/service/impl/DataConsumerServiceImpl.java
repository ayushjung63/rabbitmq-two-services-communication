package com.ayush.emailconsumer.service.impl;

import com.ayush.emailconsumer.config.RabbitMQConfig;
import com.ayush.emailconsumer.entities.Data;
import com.ayush.emailconsumer.service.DataConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class DataConsumerServiceImpl implements DataConsumerService {

   @RabbitListener(queues = RabbitMQConfig.QUEUE)
    @Override
    public void consume(Data data) {
        System.out.println("Title: "+data.getTitle());
        System.out.println("Title: "+data.getBody());
       //throw new RuntimeException("Cannot recevive data");
    }
}
