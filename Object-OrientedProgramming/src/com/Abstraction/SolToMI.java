package com.Abstraction;

interface A{
	void m1();
}

interface B{
	void m1();
}

class C implements A,B{

	@Override
	public void m1() {
		System.out.println("method implemented");
		
	}
}
public class SolToMI {

	public static void main(String[] args) {
		C c = new C();
		c.m1();

	}

}
