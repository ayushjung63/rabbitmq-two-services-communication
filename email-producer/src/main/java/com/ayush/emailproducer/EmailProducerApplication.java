package com.ayush.emailproducer;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.converter.JsonbMessageConverter;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class EmailProducerApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmailProducerApplication.class, args);
	}




}
