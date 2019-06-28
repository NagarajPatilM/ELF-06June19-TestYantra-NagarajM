package com.testyantra.javaapp.objectclass;

public class Student {
	private int age;
	private String name;
	private double height;

	public Student(int age, String name, double height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		return true;
	}

}
