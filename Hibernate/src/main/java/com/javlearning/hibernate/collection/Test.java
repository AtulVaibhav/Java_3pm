package com.javlearning.hibernate.collection;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void addUser(User user) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		

		tx.commit();
		System.out.println("Data saved");
		session.close();
		factory.close();

	}

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("Harsh");
		user.setEmail("harsh@gmail.com");

		List<Integer> contacts = new ArrayList<>();
		contacts.add(123456);
		contacts.add(345678);
		user.setContactNumbers(contacts);

		User user1 = new User();
		user1.setUsername("Amit");
		user1.setEmail("amit@gmail.com");

		List<Integer> contacts2 = new ArrayList<>();
		contacts2.add(9867545);
		contacts2.add(8796575);
		user1.setContactNumbers(contacts2);
		
		addUser(user);
		System.out.println("User saved successfully");
        addUser(user1);
	}

}
