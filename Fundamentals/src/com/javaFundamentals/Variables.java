package com.javaFundamentals;

public class Variables {
	int a = 10;
	static int b = 20;
	public void m1(){
		int data = 100;
		System.out.println(data);
	}

	public static void main(String[] args) {
		// classtype name = new classtype();
		Variables obj = new Variables();
		System.out.println("Obj1 = "+obj.hashCode());
		//objName.variableName
		System.out.println(obj.a);
		
		//access local variables:
		//obj.m1();
		
		Variables obj2 = new Variables();
		System.out.println(obj2.a);
		System.out.println("Obj2 = "+obj2.hashCode());
		
		//access static data = classname.data
	    System.out.println(Variables.b);
	    System.out.println(obj.b);
	    System.out.println(obj2.b);
        
	}

}
