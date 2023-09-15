//static or Compile-time polymorphism or Early Binding : overloading(Method overloading)

//Methods name should be same
//Number of parameters must different
//If number of parameters are same,then data type must be different
//Method overloading happens within class


package com.Polymorphism;


class Dimension{
	public void getArea(int radius){
		System.out.println("Area of Circle");
		System.out.println(Math.PI*radius*radius);
	}
	public void getArea(int len,int breadth){
		System.out.println("Area of rectangle");
		System.out.println(len * breadth);
		
	}
	public void getArea(float data){
		System.out.println("Area of square");
		System.out.println(data*data);
	}
}



public class Test {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.getArea(12);
        d.getArea(13.05f);
        d.getArea(12,13);
	}

}
