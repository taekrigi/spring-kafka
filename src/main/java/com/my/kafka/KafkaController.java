package com.my.kafka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("kafka")
@RequiredArgsConstructor
public class KafkaController {
	private final KafkaProducer producer;
	
	@PostMapping
	public String sendMessage(@RequestParam("message") String message) {
		producer.sendMessage(message);
		return "success";
	}
}
