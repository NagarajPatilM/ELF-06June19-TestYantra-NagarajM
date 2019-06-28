package com.testyantra.javaapp.arrays;

import lombok.extern.java.Log;
@Log
public class ForEach {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.eid = 1;
		e.salary = 20000;
		e.ename = "nag";

		Employee e1 = new Employee();
		e1.eid = 2;
		e1.salary = 10000;
		e1.ename = "nagu";

		Employee e2 = new Employee();
		e2.eid = 3;
		e2.salary = 25000;
		e2.ename = "naga";
		
		Employee[] ea = new Employee[3];
		ea[0] = e;
		ea[1] = e1;
		ea[2] = e2;
		
		for (Employee a : ea) {
		log.info(" "+a.eid);
		log.info(" "+a.ename);
		log.info(" "+a.salary);
		
		}

	}

}
