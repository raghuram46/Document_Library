package com.stg.microservice.CitizenService.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.microservice.CitizenService.Entity.Citizen;
import com.stg.microservice.CitizenService.ServiceImp.CitizenSerImp;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenSerImp citizenSerImp;
	
//	@RequestMapping("/test")
//	public ResponseEntity<String> test(){
//		return new ResponseEntity<String>("Hello",HttpStatus.OK);
//		
//	}
	
	@GetMapping(value = "/vaccinationCenterId/{id}")
	public ResponseEntity<List<Citizen>> getById(@PathVariable int id){
		
		List<Citizen> citizenList = citizenSerImp.getCitizens(id);
		return new ResponseEntity<>(citizenList,HttpStatus.OK);
	}
	  
	@PostMapping(value="/citizen", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){
		
		Citizen citizen = citizenSerImp.addCitizen(newCitizen);
		return new ResponseEntity<>(citizen,HttpStatus.OK);
	  }
	
	

	

}









