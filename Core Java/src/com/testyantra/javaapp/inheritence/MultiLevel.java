package com.testyantra.javaapp.inheritence;
class MahindraSuv
{
	void engine()
	{
		System.out.println("i am engine ");
	}
	void speed()
	{
		System.out.println("i will run ");
	}
}

class MahindraXuv extends MahindraSuv
{
	void extraSpace()
	{
		System.out.println("i have got extra space");
	}
}

class MahindraNewModel extends MahindraXuv
{
	void ultimate()
	{
		System.out.println("i am the ultimate mahindra");
	}
}
public class MultiLevel {
	public static void main(String[] args) {

		MahindraNewModel m=new MahindraNewModel();
		m.extraSpace();
		m.speed();
		m.engine();

	}


}
