package com.testyantra.javaapp.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(200);
		a.add("nagraj");
		a.add(2.28);

		
		for (Object o : a) {
			System.out.println(o);
		}
	}

}
