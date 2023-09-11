package com.StringBuffer;

public class StringBufferIntro {

	public static void main(String[] args) {
		//StringBuffer :Mutable :modification is allowed
		//synchronized
		//StringBuilder :non-synchronized 
		//objects stored inside heap memory
		StringBuffer sb = new StringBuffer();
		//default  =16
		System.out.println(sb.capacity());//(2*oldCapacity)+2
		
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("Hello Java");
		System.out.println(sb3.capacity());
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		
		//Methods:Thread-safe
		//1. append() method
		     sb3.append("Python");
		     System.out.println(sb3);
		     System.out.println(sb3.capacity());
		     
		//2. insert() method
		     sb3.insert(1, "DeepLearning");
		     System.out.println(sb3);
		     System.out.println(sb3.capacity());
		     
		//3. replace() method
		     sb3.replace(1,5 , "Java2EE");
		     System.out.println(sb3);
		     System.out.println(sb3.capacity());
		     
		     
		//4. delete() method
		     sb3.delete(1, 5);
		     System.out.println(sb3);
		     
		//5. reverse() method
		     sb3.reverse();
		     System.out.println(sb3);
		//6. capacity() method
		     
		     
		     String str = "wikipedia";
		     StringBuffer sb4 = new StringBuffer(str);
		     sb4.reverse();
		     System.out.println(sb4);
		     
		     
		     StringBuffer st = new StringBuffer();
		     System.out.println(st.capacity());
		     st.append("Hello Java");
		     System.out.println(st.capacity());
		     
		     StringBuffer st1 = new StringBuffer("wikipedia");
		     System.out.println(st1.capacity());
		     
		     
		

	}

}
