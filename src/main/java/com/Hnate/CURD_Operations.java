package com.Hnate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.Metadata;
import org.hibernate.query.Query;

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

	public static void updateFirstname(int id, String name) {
		Session session = Util.connectToDB();
		Employee employee = session.load(Employee.class, id);
		employee.setFirstname(name);
		session.update(employee);
		session.beginTransaction().commit();
	}

	public static void updateLastname(int id, String name) {
		Session session = Util.connectToDB();
		Employee employee = session.load(Employee.class, id);
		employee.setLastname(name);
		session.update(employee);
		session.beginTransaction().commit();
	}

	public static void updateRecord(int id, String firstname, String lastname) {
		Session session = Util.connectToDB();
		Employee employee = session.load(Employee.class, id);
		employee.setFirstname(firstname);
		employee.setLastname(lastname);
		session.update(employee);
		session.beginTransaction().commit();
	}

	public static void deleteRecord(int id) {
		Session session = Util.connectToDB();
		Employee employee = new Employee();
		employee.setId(id);
		session.delete(employee);
		session.beginTransaction().commit();
	}

	public static void getAllRecords() {
		Session session = Util.connectToDB();
		Query<Employee> query = session.createQuery("From Employee", Employee.class);
		List<Employee> list = query.list();
		list.stream()
				.forEach(st -> System.out.println(st.getId() + "   " + st.getFirstname() + "   " + st.getLastname()));
	}

	public static void searchReacordByFirstname(String name) {
		Session session = Util.connectToDB();
		Query<Employee> query = session.createQuery("Select e from Employee e where firstname=?1",
				Employee.class);
		query.setParameter(1, name);
		List<Employee> list = query.list();
		list.stream().forEach(st -> System.out.println(st));
	}
	
	public static void searchReacordByLastname(String name) {
		Session session = Util.connectToDB();
		Query<Employee> query = session.createQuery("Select e from Employee e where lastname=:name",
				Employee.class);
		query.setParameter("name", name);
		List<Employee> list = query.list();
		list.stream().forEach(st -> System.out.println(st));
	}

}
