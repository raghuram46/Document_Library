package com.stg.config;


import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

import com.stg.model.User;
import com.stg.util.kafkaUtil;


@Configuration
public class KafkaProducerConfig {
	
	  @Bean
	    public ProducerFactory<String, User> producerFactory() {
		  
	        Map<String, Object> config = new HashMap<String, Object>();

	        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaUtil.HOST);
	        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
	        config.put(JsonSerializer.ADD_TYPE_INFO_HEADERS, false);
	        config.put(JsonSerializer.TYPE_MAPPINGS, "user:com.stg.model.User");
	        return new DefaultKafkaProducerFactory<>(config);
	    }


	    @Bean(name="kafkaTemplate")
	    public KafkaTemplate<String, User> kafkaTemplate() {
	        return new KafkaTemplate<>(producerFactory());
	    }
	    
	   

}
