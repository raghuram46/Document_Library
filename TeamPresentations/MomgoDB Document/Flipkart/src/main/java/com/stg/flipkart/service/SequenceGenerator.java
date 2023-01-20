package com.stg.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import com.stg.flipkart.model.DBSequence;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import java.util.Objects;

@Service
public class SequenceGenerator {

	@Autowired
	private MongoOperations mongoOperations;

	public int getSequenceNumber(String sequenceName) {

		Query query = new Query(Criteria.where("id").is(sequenceName)); // getting seq num

		Update update = new Update().inc("seqNum", 1); // updating the seq num

		DBSequence dbSequence = mongoOperations.findAndModify(query, update, options().returnNew(true).upsert(true),
				DBSequence.class);// modifying in document

		return !Objects.isNull(dbSequence) ? dbSequence.getSeqNum() : 1;

	}
}
