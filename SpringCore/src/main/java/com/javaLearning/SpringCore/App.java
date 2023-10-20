package com.javaLearning.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //IOC container : BeanFactory(I), ApplicationContext(I)
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/javaLearning/SpringCore/Bean.xml");
    	RBI rbi = (RBI) context.getBean("sbi"); 
    	System.out.println(rbi.getBankName());
    	
    }
}
