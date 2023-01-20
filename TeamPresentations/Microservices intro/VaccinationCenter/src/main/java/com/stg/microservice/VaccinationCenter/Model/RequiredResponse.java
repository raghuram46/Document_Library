package com.stg.microservice.VaccinationCenter.Model;

import java.util.List;

import com.stg.microservice.VaccinationCenter.Enity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredResponse {

	private VaccinationCenter center;
	
	private List<Citizen> citizens;
}
