package com.testyantra.javaapp.countproject;

public class TestCard {

	public static void main(String[] args) {
		Card j=new Card();
		Card a=new Card();
		Card p=new Card();

		j.count();
		a.count();
		p.count();
		j.count();
		System.out.println("organisation count = "+Card.orgcount);
		System.out.println("java students count ="+j.count);
		System.out.println("python students count ="+p.count);
		System.out.println("Angular js students count ="+a.count);

	}

}
