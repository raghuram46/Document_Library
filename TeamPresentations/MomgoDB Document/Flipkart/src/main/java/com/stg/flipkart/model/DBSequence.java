package com.stg.flipkart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_sequence")
public class DBSequence {
	@Id
	private String id;
	private int seqNum;

	public DBSequence() {
		super();
	}

	public DBSequence(String id, int seqNum) {
		super();
		this.id = id;
		this.seqNum = seqNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

}
