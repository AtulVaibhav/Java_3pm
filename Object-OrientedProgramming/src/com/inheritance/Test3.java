package com.inheritance;

class BaseClass{
	int a = 100;
}

class DerivedClass extends BaseClass{
	int a = 200;
	public void show(){
		int a = 300;
		System.out.println(a);//300
		System.out.println(this.a);//200
		System.out.println(super.a);//100
	}
}



public class Test3 {
  
	public static void main(String[] args) {
		new DerivedClass().show();

	}

}
