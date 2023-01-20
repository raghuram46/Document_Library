package com.stg.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

	private int id;
	private int age;
	private String name;
	private char sec;

	public Student() {
		super();
	}

	public Student(int id, int age, String name, char sec) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.sec = sec;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSec() {
		return sec;
	}

	public void setSec(char sec) {
		this.sec = sec;
	}

}
