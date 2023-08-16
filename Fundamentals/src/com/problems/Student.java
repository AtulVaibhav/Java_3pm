package com.problems;

public class Student {
	int id = 101;
	String name = "Aryan";
	static String collegeName = "ABC";
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(Student.collegeName);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student();
        s2.display();
	}

}
