package com.Abstraction;
//if a class contain a single abstract also,
//then class itself needs to be declared as abstract.
//If class is declared as abstract,we can't instantiate a class
//In abstract class,we can define concrete methods

abstract class Account{
	public abstract void calculateSalary();
	public void companyName(){
		System.out.println("Microsoft");
	}
}

class Staff{}

class FTE extends Account{

	@Override
	public void calculateSalary() {
		System.out.println("Salary calulation:"+(1500*30));
		
	}
	
}


class PTE extends Account{

	@Override
	public void calculateSalary() {
		System.out.println("Salary calculation :"+(500*30));
		
	}
	
}

public class Test {

	public static void main(String[] args) {
		//Account account = new Account();
        FTE fte = new FTE();
        fte.calculateSalary();
        fte.companyName();
        
        PTE pte = new PTE();
        pte.calculateSalary();
        pte.companyName();
	}

}
