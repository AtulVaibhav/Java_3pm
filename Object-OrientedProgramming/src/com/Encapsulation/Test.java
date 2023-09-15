package com.Encapsulation;


class Employee{
	private int id;
	private String name ;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
}


public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Rahul");
		//e1.id = 200;
		
		
//		e1.setId(200);
//		e1.setName("Varun");
//		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
		

	}

}
