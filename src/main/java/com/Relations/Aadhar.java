package com.Relations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int aadharNumber;

	public Aadhar(int id, int aadharNumber) {
		this.id = id;
		this.aadharNumber = aadharNumber;
	}
	
	public Aadhar() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharNumber=" + aadharNumber + "]";
	}
	
}
