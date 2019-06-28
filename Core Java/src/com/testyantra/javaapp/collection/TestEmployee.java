package com.testyantra.javaapp.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TestEmployee {

	public static void main(String[] args) {
		EmployeeById ei2=new EmployeeById();
		EmployeeByName ei1 = new EmployeeByName();

		TreeSet<Employee> t = new TreeSet<>(ei2);
		Employee e1 = new Employee();
		e1.name = "nagu";
		e1.id = 33;
		e1.salary = 20000.0;

		Employee e2 = new Employee();
		e2.name = "subbu";
		e2.id = 35;
		e2.salary = 30000.0;

		Employee e3 = new Employee();
		e3.name = "raju";
		e3.id = 30;
		e3.salary = 40000.0;

		Employee e4 = new Employee();
		e4.name = "ganesh";
		e4.id = 36;
		e4.salary = 50000.0;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (Employee e : t) {
			log.info(" " + e.id);
			log.info(e.name);
			log.info(" " + e.salary);
			log.info("=====================");

		}

	}

}
