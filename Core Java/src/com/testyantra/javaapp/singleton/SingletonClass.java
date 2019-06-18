package com.testyantra.javaapp.singleton;

public class SingletonClass {
	private static final SingletonClass s = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getSingletonClass() {
		return s;
	}
}
