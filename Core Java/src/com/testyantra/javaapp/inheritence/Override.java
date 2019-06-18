package com.testyantra.javaapp.inheritence;
class Father
{
	void bike()
	{
		System.out.println("simple bike");
	}
}
class Son extends Father
{
	void bike()
	{
		System.out.println("modified bike");
	}
}
public class Override {
	public static void main(String[] args) {
		Father f=new Son();
		f.bike();
	}
}
