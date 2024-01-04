package com.EmbeddedIdExp;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;

import com.Hnate.Util;

import net.bytebuddy.utility.RandomString;

public class StudentUtil {

	public static void insertEmbeddedRecord() {
		Session session = Util.connectToDB(); 
		session.save(createEmbeddedObject());
		session.beginTransaction().commit();
	}
	
	public static void readEmbeddedRecords(int id) {
		Session session =Util.connectToDB();
		List<Student> list = session.createQuery("from Student where sid.id=:id",Student.class).setParameter("id", id).list();
		list.stream().forEach(st-> System.out.println(st));
	}
	
	public static Student createEmbeddedObject() {
		StudentID sId = new StudentID(new Random().nextInt(100));
		Student student = new Student(sId, new RandomString().nextString());
		return student;
	}
}
