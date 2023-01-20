package com.example.config;
import java.util.HashMap;
import java.util.Map; 

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.example.model.User;
import com.example.util.kafkaUtil;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
	
	 @Bean
	   public ConsumerFactory<String, User> consumerFactory() {
	      Map<String, Object> props = new HashMap<>();
	      props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaUtil.HOST);
	      props.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaUtil.GROUP_ID);
	      props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	      props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//	      props.put(JsonSerializer.TYPE_MAPPINGS, User.class);
//	      props.put(JsonDeserializer.VALUE_DEFAULT_TYPE, User.class);
	      props.put(JsonDeserializer.VALUE_DEFAULT_TYPE, "com.example.model.User");
	      props.put(ErrorHandlingDeserializer.KEY_DESERIALIZER_CLASS, StringDeserializer.class);
	      props.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class);
	      return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), new JsonDeserializer<>(User.class));
	      
	    		  
	   }
	   @Bean
	   public ConcurrentKafkaListenerContainerFactory<String, User> kafkaListenerContainerFactory() {
	      ConcurrentKafkaListenerContainerFactory<String, User> 
	      factory = new ConcurrentKafkaListenerContainerFactory<>();
	      factory.setConsumerFactory(consumerFactory());
	      return factory;
	   }

}
