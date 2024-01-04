package com.NamedQueries;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQuery(name = "all_users", query = "FROM User")
@NamedQuery(name = "update_record", query = "update User u set u.name=:name where u.id=:id")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "createdDate")
	private LocalDateTime datetime;

	@Column(name = "name")
	private String name;

	@Column(name = "salary")
	private double salary;

	
	
	public User() {
	}

	public User(int id, LocalDateTime datetime, String name, double salary) {
		this.id = id;
		this.datetime = datetime;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", datetime=" + datetime + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
