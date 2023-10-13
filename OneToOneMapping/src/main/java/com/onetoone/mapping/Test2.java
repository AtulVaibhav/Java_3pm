package com.onetoone.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, 1);
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getVehicle().getVehicleRegrationNumber());
        System.out.println("=========================");
        System.out.println("Fetch Customer based on vehicle");
        Vehicle vehicle = session.get(Vehicle.class, 1);
        System.out.println(vehicle.getVehicleRegrationNumber());
        System.out.println(vehicle.getCustomer().getCustomerName());
        
	}

}
