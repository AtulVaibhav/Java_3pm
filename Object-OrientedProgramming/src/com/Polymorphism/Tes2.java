//Dynamic or Runtime or LateBinding :Method Overriding(new implementation)

//Parent-Child Relationship
//Method signature is same in both classes





package com.Polymorphism;
class Parent{
//	public String getData(){
//		return "Hello";
//	}
	public String getData(int i){
		return ""+i;
	}
}

class Child extends Parent{
	
	public String getData(){
		return "Hi Java";
	}
	
	@Override
	public String getData(int i){
		return ""+i*i;
	}
}

public class Tes2 {

	public static void main(String[] args) {
		//method calls depends on objectType
		
//		Parent p = new Parent();
//		System.out.println(p.getData());
//		
		Child ch = new Child();
		System.out.println(ch.getData());
		
		
		Parent p2 = new Child();//dynamic dispatch
		//System.out.println(p2.getData());

	}

}
