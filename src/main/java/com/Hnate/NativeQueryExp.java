package com.Hnate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class NativeQueryExp {

	public static void deleteRecordWithNativeQuery(int id) {

		Session session = Util.connectToDB();
		Transaction transaction = session.beginTransaction();
		int nativeQuery = session.createNativeQuery("delete from employee where id =:id", Employee.class)
				.setParameter("id", id).executeUpdate();
		transaction.commit();
		System.out.println(nativeQuery);
	}

	public static void searchRecordByFirstTwoCharacters(String searchString) {
		Session session = Util.connectToDB();
		List<Employee> list = session
				.createNativeQuery("select * from employee where firstname like ?1", Employee.class)
				.setParameter(1, searchString + "%").list();
		list.stream().forEach(st -> System.out.println(st));
	}

}
