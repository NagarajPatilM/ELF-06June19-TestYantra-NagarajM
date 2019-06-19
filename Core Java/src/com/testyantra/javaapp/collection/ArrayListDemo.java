package com.testyantra.javaapp.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add("nag");
		a.add(2.28);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	 for(Object v:a)
		 {
		 System.out.println(v);	 }
	}
}
