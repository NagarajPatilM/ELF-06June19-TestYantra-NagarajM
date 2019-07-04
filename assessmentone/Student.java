package com.testyantra.assessmentone;

public class Student {
	String name;
	int marks;
	char gender;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	
	public Student(String name, int marks,char gender) {
		this.name = name;
		this.marks = marks;
		this.gender=gender;
	}

}
