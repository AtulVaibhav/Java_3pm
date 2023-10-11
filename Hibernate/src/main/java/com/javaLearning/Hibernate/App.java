package com.javaLearning.Hibernate;

import java.util.Scanner;

import com.javaLearning.Hibernate.utils.HibernateUtils;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		do {
			System.out.println("Enter the option :");
			System.out.println("1.addStudent 2.GetStudentById 3.GetStudents"
					+ " 4.UpdateStudent 5.DeleteStudent");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				HibernateUtils.addStudent(sc);
				break;
			case 2:
				HibernateUtils.findById(sc);
				break;
			case 3:
				HibernateUtils.findAll();
				break;
			case 4:
				HibernateUtils.updateStudent(sc);
				break;
			case 5:
				HibernateUtils.deleteById(sc);
				break;
			
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue?y/n");
			res = sc.next().charAt(0);
		} while (res == 'y');
		
		System.out.println("Thank you");
	}
}
