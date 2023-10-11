package com.javaLearning.Hibernate.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javaLearning.Hibernate.entity.Student;

public class HibernateUtils {
	private static SessionFactory factory = null;
	
	public static SessionFactory getSessionFactory(){
		Configuration cfg = new Configuration();
		if(factory==null){
		 factory = cfg.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		}
		return factory;
	} 
	
	public static void addStudent(Scanner sc){
		boolean flag = false;
		System.out.println("Enter student name:");
		String name = sc.next();
		System.out.println("Enter the course:");
		String course = sc.next();
		Student student = new Student();
		student.setName(name);
		student.setCourseEnrolled(course);
		
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		if(student!=null){
			session.save(student);
			session.getTransaction().commit();
			flag = true;
		}
		if(flag){
			System.out.println("Object saved successfully");
		}else{
			System.out.println("Something went wrong");
		}
		session.close();
		
	}
	
	public static void findById(Scanner sc){
		System.out.println("Enter the id of the student");
		int id = sc.nextInt();
		Session session = getSessionFactory().openSession();
		Student student = session.get(Student.class, id);
		if(student==null){
			System.out.println("No record found");
		}else{
			System.out.println(student);
		}
		session.close();
	}
	
	public static void findAll(){
		Session session = getSessionFactory().openSession();
		String query = "from Student";
		List<Student> list = new ArrayList<>();
		Query result = session.createQuery(query);
		list = result.list();
		if(list.isEmpty()){
			System.out.println("No records");
		}else{
			System.out.println(list);
		}
		session.close();
	}
	
	public static void updateStudent(Scanner sc){
		System.out.println("Enter the id of the student");
		int id = sc.nextInt();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Student student = session.get(Student.class, id);
		if(student==null){
			System.out.println("No record found");
		}else{
			System.out.println("Enter the name of student");
			String newName = sc.next();
			System.out.println("Enter the course");
			String newCourse = sc.next();
			student.setName(newName);
			student.setCourseEnrolled(newCourse);
			
			session.save(student);
			session.getTransaction().commit();
			System.out.println("Data updated successfully");
		}
		session.close();
		
	}
	public static void deleteById(Scanner sc){
		System.out.println("Enter the id of the student");
		int id = sc.nextInt();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Student student = session.get(Student.class, id);
		if(student==null){
			System.out.println("No record found");
		}else{
			session.delete(student);
			session.getTransaction().commit();
			System.out.println("Student deleted successfully");
		}
		session.close();
		
	}

}
