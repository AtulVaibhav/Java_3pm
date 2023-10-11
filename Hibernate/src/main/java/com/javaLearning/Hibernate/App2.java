package com.javaLearning.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javaLearning.Hibernate.entity.Address;
import com.javaLearning.Hibernate.entity.Employee;

public class App2 {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Bangalore");
        address.setState("Karnataka");	
        address.setCountry("India");
        
        Employee emp  = new Employee();
        emp.setEmpName("Akash");
        emp.setAddress(address);
		
		
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("Data saved successfully");
		session.close();
		factory.close();
	}

}
//Mapping Collection
