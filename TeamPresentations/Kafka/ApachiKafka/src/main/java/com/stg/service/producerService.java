package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stg.model.User;
import com.stg.util.kafkaUtil;

@Service
public class producerService {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	/**
	 * this method is used to publish customer records as msgs to kafka topic
	 * 
	 * @param User
	 * @return
	 * 
	 */
	
	public String add(List<User> users) {
		
		if(!users.isEmpty()) {
			for (User user : users) {
				
				kafkaTemplate.send(kafkaUtil.TOPIC, user);
				System.out.println("---- Massage published to kafka topic-----");
			}
		}
		
		return "user Record Added To Kafka Queue Successfully";
	}
}
