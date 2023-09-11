package com.inheritance;


class Employee{
	String companyName = "ABC";
}

class FTE extends Employee{
	String salary = "Rs.20000";
	public void show(){
		System.out.println(super.companyName);
		System.out.println(this.salary);
	}
}


class PTE extends Employee{
	String salary = "Rs.10000";
	public void show2(){
		System.out.println(super.companyName);
		System.out.println(this.salary);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		FTE fte = new FTE();
		fte.show();
		PTE pte = new PTE();
		pte.show2();
		
	

	}

}
