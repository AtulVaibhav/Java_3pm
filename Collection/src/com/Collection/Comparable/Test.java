package com.Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	String courseEnrolled;
	public Student(int id, String name, int age, String courseEnrolled) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.courseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", courseEnrolled=" + courseEnrolled + "]";
	}
	@Override
	public int compareTo(Student student) {
//		if(this.age > student.age) return 1;
//		else if(this.age==student.age) return 0;
//		else return -1;
		
//		if(this.id > student.id) return 1;
//		else if(this.id==student.id) return 0;
//		else return -1;
		
		return this.name.compareTo(student.name);
	}
	
	
	
}


public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(102,"Abinash",24,"Java");
		Student s2 = new Student(103,"Vivek",22,"Java2EE");
		Student s3 = new Student(105,"Satyam",26,"C++");
		Student s4 = new Student(104,"Yogesh",19,"C");
		Student s5 = new Student(101,"Amit",25,"WebDevelopment");
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("Before sorting");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("After sorting");
		System.out.println(list);
		
		 

	}

}
//