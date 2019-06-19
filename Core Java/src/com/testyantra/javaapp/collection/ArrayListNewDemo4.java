package com.testyantra.javaapp.collection;

import java.util.ArrayList;

public class ArrayListNewDemo4 {
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<>();
		a1.add(9.2);
		a1.add(1.5);
		a1.add(6.9);
		a1.add(2.4);
		a1.add(3.6);

		System.out.println("Before----->" + a1);
		
		Double ref=a1.remove(1);
		System.out.println("removed object is "+ref);
		
		System.out.println("After------" + a1);

	}
}
