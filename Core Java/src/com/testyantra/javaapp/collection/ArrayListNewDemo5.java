package com.testyantra.javaapp.collection;

import java.util.ArrayList;

public class ArrayListNewDemo5 {
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<>();
		a1.add(9.2);
		a1.add(1.5);
		a1.add(6.9);
		a1.add(2.4);
		a1.add(3.6);

		System.out.println("Before----->" + a1);
		
		boolean b=a1.remove(2.2);
		System.out.println(b);
		
		System.out.println("After------>" + a1);

	}
}
