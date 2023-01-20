package com.stg.microservice.CitizenService.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stg.microservice.CitizenService.Entity.Citizen;
@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer>{

	public List<Citizen> findByVaccinationCenterId(int citizenId);
    
}
