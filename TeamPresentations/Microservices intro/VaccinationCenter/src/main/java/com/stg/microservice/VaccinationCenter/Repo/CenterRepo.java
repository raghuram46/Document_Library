package com.stg.microservice.VaccinationCenter.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stg.microservice.VaccinationCenter.Enity.VaccinationCenter;

@Repository
public interface CenterRepo extends  JpaRepository<VaccinationCenter, Integer> {

}
