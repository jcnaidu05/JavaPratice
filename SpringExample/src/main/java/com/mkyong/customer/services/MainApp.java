package com.mkyong.customer.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huawei.test.singleton.Employee;

public class MainApp {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] { "Spring-Customer.xml" });
//
//		CustomerService cust = (CustomerService)context.getBean("customerServiceProxy");
//		cust.printName();
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Customer.xml" });

		Employee cust = (Employee) context
				.getBean("singleTonClass");
		cust.print();
		


		Employee cust12 = (Employee) context
				.getBean("singleTonClass");
		cust12.print();
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Customer.xml" });

		Employee cust1 = (Employee) context1
				.getBean("singleTonClass");
		cust1.print();

	}
}