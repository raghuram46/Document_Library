package com.stg.flipkart.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.stg.flipkart.model.User;

@Repository
public interface FlipkartRepository extends MongoRepository<User, Integer> {
	
	public List<User> findByName(String name);

	@Query("{'Address.city':?0}")
	public List<User> findByCity(String city);
	
	//public User updateUser(User user);
	
//	@Query("{order.find().sort({_id:-1}).limit(1)}")
//	public User findLastUser();

}
