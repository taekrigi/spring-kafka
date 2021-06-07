package com.my.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
	
	private static final String TOPIC = "exam";
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	
	public void sendMessage(String message) {
		System.out.println("Produce message: " + message);
		kafkaTemplate.send(TOPIC, message);
	}
}
