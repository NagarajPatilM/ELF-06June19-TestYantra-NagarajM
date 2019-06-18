package com.testyantra.javaapp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonClass s = SingletonClass.getSingletonClass();
		SingletonClass s1 = SingletonClass.getSingletonClass();
		System.out.println(s);
		System.out.println(s1);

	}

}
