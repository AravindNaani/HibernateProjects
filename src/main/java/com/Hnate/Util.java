package com.Hnate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.NamedQueries.User;

public class Util {
	private static SessionFactory sessionFactory;

	public static Session connectToDB() {
		if (sessionFactory == null) {
			try {
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(Employee.class);
				cfg.addAnnotatedClass(User.class);
				sessionFactory = cfg.buildSessionFactory();
				return sessionFactory.openSession();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		
		 return sessionFactory.openSession();
	}
}
