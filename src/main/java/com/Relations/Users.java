package com.Relations;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "createdDate")
	private LocalDateTime dateTime;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "salary")
	private double sal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "uid")
	private Aadhar uid;

	public Users(int id, LocalDateTime dateTime, String name, Aadhar uid) {
		this.id = id;
		this.dateTime = dateTime;
		this.name = name;
		this.uid = uid;
	}

	public Users() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aadhar getUid() {
		return uid;
	}

	public void setUid(Aadhar uid) {
		this.uid = uid;
	}
	
	

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", dateTime=" + dateTime + ", name=" + name + ", sal=" + sal + ", uid=" + uid + "]";
	}
	
}
