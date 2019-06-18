package com.demo;

public class ThreadClass extends Thread implements Runnable {

	/*
	 * @Override public void run() {
	 * 
	 * }
	 */
	
	void d() {
		
		System.out.println("dhdh");
	}
	void b() {
		
		String a="hjj";
		System.out.println(a);
	}
	void c() {
		System.out.println("jkk");
		String a="hjjh";
		System.out.println(a);
	}
	

	public static void main(String[] args) {

	}

}
