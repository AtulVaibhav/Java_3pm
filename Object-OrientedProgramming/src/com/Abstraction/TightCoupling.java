package com.Abstraction;

class Sleep{
	public void m2(){
		System.out.println("Sleeping time");
	}
}

class Study{
	public void m2(){
		System.out.println("Study time");
	}
}

class Eat{
	public void m2(){
		System.out.println("Eating time");
	}
}
class Task{
	//Sleep sleep;
     Study study;
	public Task(Study study) {
		super();
		this.study = study;
	}
	public void m1(){
		study.m2();
		System.out.println("task completed");
	}
	
}
public class TightCoupling {

	public static void main(String[] args) {
		Sleep sleep = new Sleep();
		Study study = new Study();
		Task task = new Task(study);
		task.m1();

	}

}
