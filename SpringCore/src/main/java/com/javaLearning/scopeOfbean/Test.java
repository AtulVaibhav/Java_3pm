package com.javaLearning.scopeOfbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/javaLearning/scopeOfbean/Bean.xml");
        Consumer con = classPathXmlApplicationContext.getBean("user",Consumer.class);
	    System.out.println(con.hashCode());
	    
	    Consumer con2 = classPathXmlApplicationContext.getBean("user",Consumer.class);
	    System.out.println(con2.hashCode());
	
	}

}
