package com.javaLearning.constructor.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 ClassPathXmlApplicationContext context = new
			  ClassPathXmlApplicationContext("com/javaLearning/constructor/DI/Bean.xml");
      Employee emp = context.getBean("emp",Employee.class);
      System.out.println(emp.getId());
      System.out.println(emp.getEmpName());
      System.out.println(emp.getEmpDept());
      context.close();
	}

}
