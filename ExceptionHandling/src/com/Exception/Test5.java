//CustomException:
//class must extends Exception

package com.Exception;

import java.util.Scanner;

class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString(){
		return "Student (id:"+id+" name:"+name+" )";
	}
}


class StudentDB{
	public static Student[] getStudents(){
		Student s1 = new Student(101,"Harsh");
		Student s2 = new Student(102,"Aman");
		Student s3 = new Student(103,"John");
		Student s4 = new Student(104,"Karthik");
		Student s5 = new Student(105,"Himanshu");
		
		Student[] studentData = {s1,s2,s3,s4,s5};
		
		return studentData;
	}
}

@SuppressWarnings("serial")
class StudentNotFoundException extends Exception{
	private String msg;
	StudentNotFoundException(String msg){
		this.msg = msg;
	}
	public String getMsg(){
		return this.msg;
	}
}


public class Test5 {
	public static void getStudentById(int id,Student[] students){
		boolean flag = false;
		for(int i=0;i<students.length;i++){
			if(students[i].id==id){
				flag = true;
				System.out.println(students[i]);
				break;
			}
		}
		if(flag){
			System.out.println("Student found");
		}else{
			try{
			throw new StudentNotFoundException("Student doesn't exit in record");
			}catch(StudentNotFoundException obj){
				System.out.println(obj.getMsg());
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of student");
		int id = sc.nextInt();
		getStudentById(id, StudentDB.getStudents());
		

	}

}
