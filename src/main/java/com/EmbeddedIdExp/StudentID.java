package com.EmbeddedIdExp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class StudentID implements Serializable{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "marks")
	private int marks;

	
	
	public StudentID() {
	}

	public StudentID(int marks) {
		this.marks = marks;
	}

	public StudentID(int id, int marks) {
		this.id = id;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentID [id=" + id + ", marks=" + marks + "]";
	}
	
	
}
