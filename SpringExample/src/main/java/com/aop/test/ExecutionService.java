package com.aop.test;

public class ExecutionService {
	public void start() {
		System.out.println("ExecutionService.start()");
	}

	public void create() {
		System.out.println("ExecutionService.create()");
		start();

	}
}
