package com.javaFundamentals;
//Parameterized Constructor

public class Employee {
//	int empId = 101;
//	String empName = "Aryan";
	
	int empId;
	String empName;
	int empAge;
	Employee(int id,String name,int age){
		System.out.println(id+" "+name+" "+age);
		empId = id;
		empName = name;
		empAge = age;
		
	}	
	public void show(){
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empAge);
	}

	public static void main(String[] args) {
		Employee obj = new Employee(101,"Aryan",21);// heap memory
		obj.show();
		
		Employee obj2 = new Employee(102,"Amit",23);
		obj2.show();
		
		Employee obj3 = obj;
		obj3.show();
		
		
		

	}

}
