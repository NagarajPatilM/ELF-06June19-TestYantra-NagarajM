package com.testyantra.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListNewDemo1 {
	
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<>();
		a1.add(9.2);
		a1.add(1.5);
		a1.add(6.9);
		a1.add(2.4);
		a1.add(3.6);

		log.info("Before----->" + a1);

		a1.add(22.34);

		log.info("After------>" + a1);

	}
}
