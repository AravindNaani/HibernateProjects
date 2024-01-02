package com.Hnate;

import org.hibernate.Session;

public class CURD_Operations {
	
	public static void insertRecord(Employee emp) {
		
		Session session = Util.connectToDB();
		session.save(emp);
		session.beginTransaction().commit();
	}
	
	public static void getRecord(int id) {
		Session session = Util.connectToDB();
		Employee employee = session.get(Employee.class, id);
		System.out.println(employee);
	}
	
	public static void updateFirstname(int id,String name) {
		Session session = Util.connectToDB();
		Employee employee = session.load(Employee.class, id);
		employee.setFirstname(name);
		session.update(employee);
		session.beginTransaction().commit();
	}
	
	public static void updateLastname(int id,String name) {
		Session session = Util.connectToDB();
		Employee employee = session.load(Employee.class, id);
		employee.setLastname(name);
		session.update(employee);
		session.beginTransaction().commit();
	}
	
	public static void updateRecord(int id,String firstname,String lastname) {
		Session session = Util.connectToDB();
		Employee employee = session.load(Employee.class, id);
		employee.setFirstname(firstname);
		employee.setLastname(lastname);
		session.update(employee);
		session.beginTransaction().commit();
	}

}
