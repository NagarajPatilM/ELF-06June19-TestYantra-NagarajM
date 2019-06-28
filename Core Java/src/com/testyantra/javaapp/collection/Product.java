package com.testyantra.javaapp.collection;

public class Product implements Comparable<Product> {

	String name;
	int cost;
	double rating;

	public Product(String name, int cost, double rating) {
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}

	public int compareTo(Product o) {
		Integer k = this.cost;
		int v = k.compareTo(o.cost);
		return v * -1;
	}

}
