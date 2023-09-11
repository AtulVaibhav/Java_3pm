package com.accessmodifiers.pack1;

import com.accessmodifiers.pack2.Demo2;




public class Test {

	public static void main(String[] args) {
//	Demo1 d = new Demo1();
//		System.out.println(d.data);
//		
//		Demo2 d2 = new Demo2();	
//		System.out.println(d2.data);
		
		
//		Child1 ch = new Child1();
//		System.out.println(ch.data);

	}

}

/*default: within package: accessible
         outside package :not accessible
         
  public:  within package: accessible
         outside package : accessible 
         
  private: within same class where declared 
           within package: not accessible
         outside package : not accessible 
         
  protected:Parent: within same package :accessible
                    outside package :not accessible
                    
            Child : 
            if parent and child present in same package:accessible
            if parent and child present in different package:not accessible
                 
         *
         */

