package com.stg.microservice.VaccinationCenter.Controller;

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


import com.stg.microservice.VaccinationCenter.Enity.VaccinationCenter;

import com.stg.microservice.VaccinationCenter.Model.RequiredResponse;

import com.stg.microservice.VaccinationCenter.ServiceImp.VaccinationCenterSerImp;



@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
	
	@Autowired
	private VaccinationCenterSerImp centerSerImp;
	
	
	
	@GetMapping(value = "/id2/{id}")
	public ResponseEntity<VaccinationCenter> getById(@PathVariable int id){
		
		VaccinationCenter VaccinationCenter = centerSerImp.getCenterById(id);
		return new ResponseEntity<>(VaccinationCenter,HttpStatus.OK);
	}
	
	
	@PostMapping(value="/vaccinationcenter", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VaccinationCenter> addVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter){
		
		VaccinationCenter addCenter = centerSerImp.addVaccinationCenter(vaccinationCenter);
		return new ResponseEntity<>(addCenter,HttpStatus.OK);
	  }
	
	
	
	@GetMapping(value="/id/{id}")
	public ResponseEntity<RequiredResponse> getAllDataByCenterId(@PathVariable int id ){
		RequiredResponse requiredResponse = centerSerImp.getAllDataBasedOnCenterId(id);

		return new ResponseEntity<RequiredResponse>(requiredResponse,HttpStatus.OK);
		 
		 
	}
	
	
	
	
}
