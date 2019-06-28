package com.testyantra.javaapp.assesment;

/*This is the Java Bean class
 with private fields
 and public getters and setters methods
*/
public class BeanMobile {

	private String brand;
	private int cost;
	private int ram;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
