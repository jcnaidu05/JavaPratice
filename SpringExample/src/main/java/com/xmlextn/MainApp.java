package com.xmlextn;

import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:*META-INF/my.spring.service.xml" });

		SimpleDateFormat obj = (SimpleDateFormat) context
				.getBean("jobDetailTemplate");
		System.out.println(obj.isLenient());
	}
}