package com.Aggregation;

class Student{
	int id;
	Student(int id){
		this.id = id;
	}
	
	@Override
	public String toString(){
		return ""+this.id;
	}
}


public class Test2 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);//10
		String str = new String("Java");
		System.out.println(str);//Java
		Student s1 = new Student(101);
		System.out.println(s1.toString());
	}
}

//Object : toString():content



