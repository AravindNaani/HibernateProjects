package com.Relations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

import org.hibernate.Session;

import com.Hnate.Util;

import net.bytebuddy.utility.RandomString;

public class UsersUtil {

	public static void insertRecordR() {
		Session session = Util.connectToDB();
		session.save(getUsersObject());
		session.beginTransaction().commit();
	}
	
	public static Users getUsersObject() {
		Aadhar aadhar = new Aadhar();
		aadhar.setAadharNumber(Math.abs(new Random().nextInt()));
		Users users = new Users();
		users.setName(new RandomString().nextString());
		users.setSal(new Random().nextDouble(150.00));
		users.setDateTime(null);
		users.setUid(aadhar);
		return users;
	}
}
