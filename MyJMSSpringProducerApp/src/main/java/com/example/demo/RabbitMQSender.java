package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${sujata.rabbitmq.exchange}")
	private String exchange; 
	
	@Value("${sujata.rabbitmq.routingkey}")
	private String routingKey;
	
	String topic="Java_By_Sujata";
	
	public void send(Employee employee){
		amqpTemplate.convertAndSend(exchange,routingKey,employee);
		System.out.println("send msg "+employee);
	}
}
