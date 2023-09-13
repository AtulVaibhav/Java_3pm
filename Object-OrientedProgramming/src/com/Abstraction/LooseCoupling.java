package com.Abstraction;


interface DoSomething{
	void m2();
}

class Sleep1 implements DoSomething{
	public void m2(){
		System.out.println("Sleeping time");
	}
}

class Study1 implements DoSomething{
	public void m2(){
		System.out.println("Study time");
	}
}

class Eat1 implements DoSomething{
	public void m2(){
		System.out.println("Eating time");
	}
}
class Task1{
	DoSomething d; 
	
	Task1(DoSomething d){
		this.d = d;
	}
	
	public void m1(){
		d.m2();
		System.out.println("task completed");
	}
	
}


public class LooseCoupling {

	public static void main(String[] args) {
		Sleep1 s1 = new Sleep1();
		Study1 st1 = new Study1();
		Eat1 e1 = new Eat1();
		
		Task1 t = new Task1(st1);
		t.m1();
		
		

	}

}
