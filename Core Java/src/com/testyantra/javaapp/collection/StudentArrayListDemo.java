package com.testyantra.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayListDemo {

	public static void main(String[] args) {
		Student s1 = new Student("nagaraj", 1, 56.2);
		Student s2 = new Student("shweta", 2, 56.2);
		Student s3 = new Student("nandini", 3, 60.2);
		Student s4 = new Student("veeresh", 4, 58.2);
		ArrayList<Student> a = new ArrayList<>();

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);

		Iterator<Student> i = a.iterator();
		while (i.hasNext()) {
			Student st = i.next();
			System.out.println(st.name);
			System.out.println(st.id);
			System.out.println(st.percentage);
			System.out.println("===========");
		}
	}

}
