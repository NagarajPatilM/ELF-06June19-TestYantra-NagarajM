package com.testyantra.javaapp.constructors;

import java.util.logging.Logger;

public class Student {
	String name;
	int age;
	double percentage;
	public static final Logger loger=Logger.getLogger("virat");

	Student(String n, int a, double p) {
		name = n;
		age = a;
		percentage = p;
	}

	void display() {
		//loger.log()
		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("percentage is " + percentage);
	}
}
