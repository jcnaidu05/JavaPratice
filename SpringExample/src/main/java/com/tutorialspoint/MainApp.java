package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/test.xml");

		StudentDAO studentJDBCTemplate = (StudentDAO) context
				.getBean("studentJDBCTemplate");

//		studentJDBCTemplate.create(234, "1Zara", 13);
		System.out.println(studentJDBCTemplate.getStudent(1).getName());
//		System.out.println(studentJDBCTemplate.listStudents());
//		studentJDBCTemplate.create(2, "Nuha", 2);
//		studentJDBCTemplate.create(3, "Ayan", 15);
	}
}