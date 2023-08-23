package com.javaFundamentals;

public class Operators {
	
	public static void main(String[] args) {
		//Arithmatic(+,-,*,/,%)
		int a = 10;
		int b = 5;
		
		System.out.println("add:"+(a+b));
		System.out.println("sub:"+(a-b));
		System.out.println("mul:"+(a*b));
		System.out.println("div:"+(a/b));
		System.out.println("mod:"+(a%b));
		
		
		//Unary(++, --, ~(convert to 1's complement))
		int c = 10;
		int d = ++c;	
		
		System.out.println(c+" "+d);
		
		int e = -5;
		System.out.println(~e);
		
		
	
		//Relational(>,<,<=,>=,==,!=):return boolean
		System.out.println(5<6);
		int x = 10;
		int y = 12;
		System.out.println(x!=y); 
		
		//Logical(&&, ||, !): 
		System.out.println((10==9) && (11==11)); 
		
		System.out.println(!((x>y) || (!(x<y))));
		
		
		//Assignment(=,+=,-=,*=,/=,%=)
		int m = 10;
		int n = 20;
		m = n;
		System.out.println(m+" "+n);
		
		c = c+10;
	    c += 10;
		
		//Ternary(?:)
	    //expression ? value1 : value2
	    int data = 100;
	    int num = 200;
	     String result = (data>num)? "Success":"Failed";
	     System.out.println(result);
	   
		//Bitwise(&,|,^)
	     
	     int num2 = 5;  //    0 1 0 1
	     int num3 = 4;  //    0 1 0 0  = 0001  
	     
	    		 
	     System.out.println(num2 ^ num3);
	     
		//Shift(<<,>>)                   1 0 1 0
	     //<< left shift               1 0 1 0 0
	     System.out.println(10<<2);//1 0 1 0 0 0
	     
	     // >> right shift divide by 2
	     System.out.println(20>>2);   
	     
		//instanceof 
	     
	     Operators op = new Operators();
	     System.out.println(op instanceof Operators);
               
	}

}
