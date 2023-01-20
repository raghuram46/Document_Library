package com.stg.microservice.VaccinationCenter.service;


import com.stg.microservice.VaccinationCenter.Enity.VaccinationCenter;
import com.stg.microservice.VaccinationCenter.Model.RequiredResponse;

public interface VaccinationCenterSer {
	
	public abstract VaccinationCenter  addVaccinationCenter(VaccinationCenter vaccinationCenter);
	
	public abstract VaccinationCenter  getCenterById(int centerId);
	
	public abstract RequiredResponse getAllDataBasedOnCenterId(int id);

}
