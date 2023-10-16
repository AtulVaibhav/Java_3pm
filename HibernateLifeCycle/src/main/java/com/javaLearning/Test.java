package com.javaLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		//Transient state
		Vehicle v = new Vehicle();
		v.setVehicleName("Santro");
		v.setVehicleType("disel");
		System.out.println("Object in Transient state");
		SessionFactory factory = new Configuration()
				                .configure().buildSessionFactory();
		Session session = factory.openSession();
        
		session.beginTransaction();
		session.save(v);
		
		session.getTransaction().commit();
		System.out.println();
		System.out.println("Object is in Persistent state");
		session.close();
		System.out.println("Object is in detached state");
		v.setVehicleName("RangeRover");
		System.out.println("Object name changed");
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		session2.update(v);
		session2.getTransaction().commit();
		System.out.println("Object is in Persistent state");
		session2.close();
		
		
		
	}

}
