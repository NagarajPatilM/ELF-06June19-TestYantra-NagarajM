package com.testyantra.javaapp.collection;

public class Student implements Comparable<Student> {
	String name;
	int id;
	double percentage;

	public Student(String name, int id, double percentage) {

		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	/* logic to sort Students wrt id */
	/*
	 * public int compareTo(Student s) {
	 * 
	 * if (this.id < s.id) { return -1; } else if (this.id > s.id) { return 1; }
	 * else { return 0; } }
	 */

	@Override
	public int compareTo(Student o) {

		return this.name.compareTo(o.name);

	}

	/* logic to sort students wrt percentage */

	/*
	 * public int compareTo(Student s) {
	 * 
	 * if (this.percentage < s.percentage) { return -1; } else if (this.percentage >
	 * s.percentage) { return 1; } else { return 0; }
	 * 
	 * }
	 */

}
