package com.onetoone.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("Vivek");
		customer.setContactNumber(12345);
		
		Vehicle v1 = new Vehicle();
		v1.setVehicleRegrationNumber("er345gft");
		v1.setCustomer(customer);
		customer.setVehicle(v1);
		
		SessionFactory factory = new Configuration()
				                 .configure().buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		System.out.println("Customer saved successfully");
		session.close();
		factory.close();

	}

}
