package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentName("Abinash");
		
		Course course = new Course();
		course.setCourseName("Java");
		course.setStudent(s);
		
		Course course2 = new Course();
		course2.setCourseName("Python");
		course2.setStudent(s);
		
		Course course3 = new Course();
		course3.setCourseName("AI");
		course3.setStudent(s);
		
		List<Course> list = new ArrayList<>();
		list.add(course);
		list.add(course2);
		list.add(course3);
		
		s.setCourse(list);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        System.out.println("STudent saved successfully");
        session.close();
        factory.close();
        
	}

}
