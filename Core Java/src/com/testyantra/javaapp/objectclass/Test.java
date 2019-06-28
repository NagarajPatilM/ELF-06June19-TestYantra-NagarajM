package com.testyantra.javaapp.objectclass;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		Student s = new Student(23, "nag", 5.6);
		Student s1 = new Student(28, "nag", 5.7);
		log.info(" " + s.equals(s1));

	}

}
