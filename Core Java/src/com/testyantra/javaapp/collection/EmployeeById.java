package com.testyantra.javaapp.collection;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		/*
		 * if (o1.id > o2.id) { return 1; } else if (o1.id < o2.id) { return -1; } else
		 * { return 0; }
		 */

		Integer oo1 = (Integer) o1.id;
		Integer oo2 = (Integer) o2.id;
		return oo1.compareTo(oo2);

	}
}
