package com.testyantra.javaapp.constructorreference;

public class Product {

	String name;
	String brand;
	int price;

	public Product(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product {name=" + name + ", brand=" + brand + ", price=" + price + "}";
	}

}
