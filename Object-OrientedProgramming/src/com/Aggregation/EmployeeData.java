package com.Aggregation;

public class EmployeeData {
	int id;
	String name;
	static String deptName ;
	static{
		deptName="R&D";
	}

	public EmployeeData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	


	@Override
	public String toString() {
		return "id="+id+" name="+name+" deptName="+EmployeeData.deptName;
	}




	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData(101,"Harsh");
		System.out.println(e1);

	}

}
