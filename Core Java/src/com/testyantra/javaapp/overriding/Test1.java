package com.testyantra.javaapp.overriding;

 class Animal{
void eat()
{
	
}



}
class Cow extends Animal
{
	void eat()
	{
		
	}
}

class Lion extends Animal
{
	void eat()
	{
		System.out.println("hjk");
	}
}
class Test1
{
	static Animal a;
	public static void main(String[] args)
	{
	a=new Lion();
	a.eat();
	}
}
