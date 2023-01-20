package com.stg.microservice.CitizenService.service;

import java.util.List;

import com.stg.microservice.CitizenService.Entity.Citizen;

public interface CitizenServiceSer {
	
	public abstract List<Citizen>  getCitizens(int vaccinationCenterId);
	
	public abstract Citizen  addCitizen(Citizen newCitizen);

}
