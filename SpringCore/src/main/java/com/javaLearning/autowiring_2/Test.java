package com.javaLearning.autowiring_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/javaLearning/autowiring_2/Bean.xml");
	     PersonData bean = context.getBean("person",PersonData.class);
	     System.out.println(bean.getPersonName());
	     System.out.println(bean.getBank().getBankName());
	
	
	}

}
