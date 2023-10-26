package com.javaLearning.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/javaLearning/autowiring/Bean.xml");
        Person bean = context.getBean("person",Person.class);
        System.out.println(bean.getPersonName());
        System.out.println(bean.getAddress().getCity());
        System.out.println(bean.getAddress().getState());
	}

}
