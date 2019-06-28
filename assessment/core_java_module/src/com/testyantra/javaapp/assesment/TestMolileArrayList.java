package com.testyantra.javaapp.assesment;

import java.util.ArrayList;

public class TestMolileArrayList {

	public static void main(String[] args) {
		
		ArrayList<BeanMobile> al = new ArrayList<>();
		BeanMobile m1 = new BeanMobile();

		m1.setBrand("Apple");
		m1.setCost(50000);
		m1.setRam(8);

		BeanMobile m2 = new BeanMobile();

		m2.setBrand("Xiaomi");
		m2.setCost(20000);
		m2.setRam(4);

		BeanMobile m3 = new BeanMobile();

		m3.setBrand("Samsung");
		m3.setCost(40000);
		m3.setRam(4);

		BeanMobile m4 = new BeanMobile();

		m4.setBrand("Micromax");
		m4.setCost(10000);
		m4.setRam(4);

		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		MobileDetails.getMobileDetails(al);
		

	}

}
