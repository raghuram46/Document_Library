package com.stg.microservice.CitizenService.ServiceImp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.microservice.CitizenService.Entity.Citizen;
import com.stg.microservice.CitizenService.Repo.CitizenRepo;
import com.stg.microservice.CitizenService.service.CitizenServiceSer;

@Service
public class CitizenSerImp implements CitizenServiceSer {
	
	@Autowired
	private  CitizenRepo citizenRepo;

	@Override
	public List<Citizen> getCitizens(int vaccinationCenterId) {
		
		return citizenRepo.findByVaccinationCenterId(vaccinationCenterId);
		
	}

	@Override
	public Citizen addCitizen(Citizen newCitizen) {
		
		return citizenRepo.save(newCitizen);

	}

}
