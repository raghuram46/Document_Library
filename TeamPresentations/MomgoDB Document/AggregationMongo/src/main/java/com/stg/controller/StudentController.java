package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.AgeCount;
import com.stg.model.Student;
import com.stg.repository.StudentRepository;

@RestController
@RequestMapping(value = "stud")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@GetMapping("/group")
	public List<AgeCount> groupByAge() {

		// grouping by age.
		GroupOperation groupOperation = Aggregation.group("age").count().as("count");

		// filtering same age count > 1

		MatchOperation matchOperation = Aggregation.match(new Criteria("count").gt(0));

		Aggregation aggregation = Aggregation.newAggregation(groupOperation, matchOperation);

		AggregationResults<AgeCount> result = mongoTemplate.aggregate(aggregation, "student", AgeCount.class);

		return result.getMappedResults();
	}

	@PostMapping(value = "create")
	public Student createStud(@RequestBody Student student) {
		return studentRepository.save(student);
	}

	@GetMapping(value = "getalls")
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

}
