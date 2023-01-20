package com.stg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stg.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
	
	

}
