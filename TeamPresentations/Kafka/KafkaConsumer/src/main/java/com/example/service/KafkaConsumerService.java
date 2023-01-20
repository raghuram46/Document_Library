package com.example.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.example.model.User;
import com.example.util.kafkaUtil;


@Service
public class KafkaConsumerService {
	
	
	@KafkaListener(topics = kafkaUtil.TOPIC, groupId = kafkaUtil.GROUP_ID)
	public User  listener(User c) {
		
		System.out.println("---- Massage received from kafka Topic :: " + c);
		
//		System.out.println("name :"+c.getName());
//		System.out.println("department :"+c.getDept());
//		System.out.println("salary :"+c.getSalary());
		
		return c;
	}

}
