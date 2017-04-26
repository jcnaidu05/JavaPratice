package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});
	
    	ExecutionService cust = (ExecutionService)appContext.getBean("executionService");
    	
    	System.out.println("*************************");
    	cust.create();
    	System.out.println("*************************");
    	cust.start();
    	
    }
}
