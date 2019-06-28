package com.testyantra.javaapp.collection;

import java.util.TreeSet;

public class StudentTreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Student> t = new TreeSet<>();
		Student s1 = new Student("nagaraj", 1, 56.2);
		Student s2 = new Student("shweta", 2, 56.4);
		Student s3 = new Student("nandini", 4, 60.2);
		Student s4 = new Student("veeresh", 3, 58.2);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		
		for(Student s:t) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			System.out.println("--------------");
			
		}
	}

}
