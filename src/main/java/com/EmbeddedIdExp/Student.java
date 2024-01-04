package com.EmbeddedIdExp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@EmbeddedId
	private StudentID sid;
	
	@Column(name = "name")
	private String name;

	public Student(StudentID id, String name) {
		this.sid = id;
		this.name = name;
	}

	public Student() {
	}

	public StudentID getId() {
		return sid;
	}

	public void setId(StudentID id) {
		this.sid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
}
