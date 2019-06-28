package com.testyantra.javaapp.assessment;

public class MyCalculateClass {

	public  double toCalculateSI(int p, double t, double r) {

		double simpleInterest = (p * t * r) / 100.0;
		return simpleInterest;

	}

	public int toCalFact(int num) {
		int fact = 1;
		while (num > 1) {
			fact = fact * num--;
		}
		return fact;

	}

	public double calPercent(int[] ar, int total) {
		int marks = 0;
		for (int i = 0; i < ar.length; i++) {
			marks = marks + ar[i];
		}

		double percentage = (marks * 100 / total);
		return percentage;

	}

}
