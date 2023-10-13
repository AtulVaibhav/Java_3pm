package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//creating employee
		Employee e1 = new Employee();
		e1.setEmpName("emp1");
		
		Employee e2 = new Employee();
		e2.setEmpName("emp2");
		
		Employee e3 = new Employee();
		e3.setEmpName("emp3");
		
		Project p1 = new Project();
		p1.setProjectName("proj1");
		
		Project p2 = new Project();
		p2.setProjectName("proj2");
		
		Project p3 = new Project();
		p3.setProjectName("proj3");
		
		List<Employee> listOfEmpForP1 = new ArrayList<>();
		listOfEmpForP1.add(e1);
		listOfEmpForP1.add(e3);
		p1.setEmployee(listOfEmpForP1);
		
		List<Employee> listOfEmpForP2 = new ArrayList<>();
		listOfEmpForP2.add(e2);
		listOfEmpForP2.add(e3);
		p2.setEmployee(listOfEmpForP2);
		
		List<Employee> listOfEmpForP3 = new ArrayList<>();
		listOfEmpForP3.add(e1);
		listOfEmpForP3.add(e2);
		p3.setEmployee(listOfEmpForP3);
		
		
		List<Project> listOfProjectForE1 = new ArrayList<>();
		listOfProjectForE1.add(p1);
		listOfProjectForE1.add(p3);
		e1.setProjects(listOfProjectForE1);
		
		List<Project> listOfProjectForE2 = new ArrayList<>();
		listOfProjectForE2.add(p2);
		listOfProjectForE2.add(p3);
		e2.setProjects(listOfProjectForE2);
		
		List<Project> listOfProjectForE3 = new ArrayList<>();
		listOfProjectForE3.add(p1);
		listOfProjectForE3.add(p2);
		e3.setProjects(listOfProjectForE3);
		
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		session.getTransaction().commit();
		System.out.println("Data saved successfully");
		session.close();
		factory.close();
		
		
		

	}

}
