package com.stg.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.flipkart.model.User;
import com.stg.flipkart.repository.FlipkartRepository;
import com.stg.flipkart.service.SequenceGenerator;

@RestController
@RequestMapping(value = "user")
public class FilpkartController {

	@Autowired
	private FlipkartRepository flipkartRepository;

	@Autowired
	private SequenceGenerator sequenceGenerator;

	@PostMapping(value = "post")
	public String placeOrder(@RequestBody User user) {

		//user.setId(sequenceGenerator.getSequenceNumber(User.SEQUENCE_NUMBER)); // setting the number
		flipkartRepository.save(user);
		return "order placed";
	}

	@GetMapping(value = "getall/{name}")
	public List<User> getUserByName(@PathVariable String name) {
		// System.out.println(flipkartRepository.findLastUser().getId()+"/////////////////");
		return flipkartRepository.findByName(name);
	}

	@GetMapping(value = "getalls/{city}")
	public List<User> getUserByCity(@PathVariable String city) {
		return flipkartRepository.findByCity(city);
	}
//
//	@PutMapping(value = "update")
//	public User updateUser(@RequestBody User user) {
//		return flipkartRepository.updateUser(user);
//	}

}
