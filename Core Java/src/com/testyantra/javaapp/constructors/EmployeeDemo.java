package com.testyantra.javaapp.constructors;

public class EmployeeDemo {
	String name;
	int age;
	double salary;

	EmployeeDemo(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	void display() {
		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("salary is " + salary);
	}

	public static void main(String[] args) {

		EmployeeDemo e = new EmployeeDemo("nag", 23, 20000);
		e.display();
	}

}
