package com.javaLearning.constructor.DI;

public class Employee {
	private int id;
	private String empName;
	private String empDept;

	public Employee(int id, String empName, String empDept) {
		super();
		this.id = id;
		this.empName = empName;
		this.empDept = empDept;
	}

	public int getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}

}
