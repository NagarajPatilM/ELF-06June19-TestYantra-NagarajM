package com.testyantra.javaapp.overloading;

public class Train {
	void search(int id)
	{
		System.out.println("train is identified by its id");
	}
	void search(String trainname)
	{
		System.out.println("train is identified by its name");
	}
}
