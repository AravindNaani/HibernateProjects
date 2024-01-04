package com.NamedQueries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hnate.Util;

public class NamedQueryExp {

	public static void getRecords() {
		Session session = Util.connectToDB();
		List<User> list = session.createNamedQuery("all_users", User.class).list();
		list.stream().forEach(user -> System.out.println(user));
	}

	public static void updateRecord(int id, String name) {
		Session session = Util.connectToDB();
		Transaction transaction = session.beginTransaction();
		session.createNamedQuery("update_record").setParameter("name", name).setParameter("id", id).executeUpdate();
		transaction.commit();
	}
}
