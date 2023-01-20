package com.stg.microservice.VaccinationCenter.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stg.microservice.VaccinationCenter.Enity.VaccinationCenter;
import com.stg.microservice.VaccinationCenter.Model.Citizen;
import com.stg.microservice.VaccinationCenter.Model.RequiredResponse;
import com.stg.microservice.VaccinationCenter.Repo.CenterRepo;
import com.stg.microservice.VaccinationCenter.service.VaccinationCenterSer;

@Service
public class VaccinationCenterSerImp implements VaccinationCenterSer {

	@Autowired
	private CenterRepo centerRepo;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public VaccinationCenter addVaccinationCenter(VaccinationCenter vaccinationCenter) {

		return centerRepo.save(vaccinationCenter);
	}

	@Override
	public VaccinationCenter getCenterById(int centerId) {

		return centerRepo.findById(centerId).orElse(null);
	}

	@Override
	public RequiredResponse getAllDataBasedOnCenterId(int id) {
		RequiredResponse requiredResponse = new RequiredResponse();

		// 1st get vaccination center details
		VaccinationCenter center = centerRepo.findById(id).get();
		requiredResponse.setCenter(center);

		// 2nd get all citizen registered to vaccination center
		List<Citizen> listOfCitizens = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/vaccinationCenterId/" + id, List.class);
		requiredResponse.setCitizens(listOfCitizens);

		return requiredResponse;
	}

}
