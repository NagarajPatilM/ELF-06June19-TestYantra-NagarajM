package com.testyantra.javaapp.collection;

public class Car implements Comparable<Car> {
	String name;
	String brand;
	int cost;
	double rating;

	public Car(String name, String brand, int cost, double rating) {
		this.name = name;
		this.brand = brand;
		this.cost = cost;
		this.rating = rating;
	}

	public int compareTo(Car o) {
	    Double k=this.rating;
		Double s=o.rating;
		
		return k.compareTo(s);
	}

}
