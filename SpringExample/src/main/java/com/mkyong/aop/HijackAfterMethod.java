package com.mkyong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//after a method is invoke
public class HijackAfterMethod implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("HijackAfterMethod : After method hijacked!");
		System.out.println("Hello world");
		System.out.println("Hello Shanvi");
	}
	
}
