package com.testyantra.javaapp.assignmentthree;

public class SearchEngineTest {

	public static void main(String[] args) {
		SearchEngine s = new SearchEngine();
		Employee e = new Employee();

		e.setName("pankaj");
		e.setId(33);

		s.search(e);

	}

}
