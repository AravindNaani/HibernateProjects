package com.Hnate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.EmbeddedIdExp.Student;
import com.EmbeddedIdExp.StudentID;
import com.NamedQueries.User;
import com.Relations.Aadhar;
import com.Relations.Users;

public class Util {
	private static SessionFactory sessionFactory;

	public static Session connectToDB() {
		if (sessionFactory == null) {
			try {
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(Employee.class);
				cfg.addAnnotatedClass(User.class);
				cfg.addAnnotatedClass(Student.class);
				cfg.addAnnotatedClass(Users.class);
				cfg.addAnnotatedClass(Aadhar.class);
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
