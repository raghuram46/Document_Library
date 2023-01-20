package com.stg.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.User;
import com.stg.service.producerService;

@RestController
@RequestMapping("kafka")
public class ControllerOne {
	
	
	
	@Autowired
	private producerService producerService;

    @GetMapping("/publish")
    public List<User> getAll() {
    	
        User user1 = new User("sai", "Technology", 12000L);
        User user2 = new User("saikrishna", "Technology", 19000L);
        User user3 = new User("saigopal", "Technology", 62000L);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return userList;
    }
	
	
    @PostMapping(value = "/addUser" ) 
    public String addUser(@RequestBody List<User> users) {
//    	User c = new User("kiran", "Tech", 1200L);
    	return producerService.add(users);
    }
    
    

}
