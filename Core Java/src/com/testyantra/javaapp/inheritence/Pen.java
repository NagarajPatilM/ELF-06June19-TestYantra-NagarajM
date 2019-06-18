package com.testyantra.javaapp.inheritence;

public class Pen {
	int cost;
	void write()
	{
		System.out.println("My job is to write");
	}
}

class Marker extends Pen
{
	void color()
	{
		System.out.println("I'm black color");
	}
}
