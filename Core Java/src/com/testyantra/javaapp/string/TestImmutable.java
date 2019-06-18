package com.testyantra.javaapp.string;

public class TestImmutable {

	public static void main(String[] args) {
		ImmutableClass i = new ImmutableClass("nagaraj", "nag");
		String s = i.getName();
		String s1 = i.getNickname();
		System.out.println(s);
		System.out.println(s1);

		ImmutableClass i1 = new ImmutableClass("virat", "king");
		System.out.println(i1.getName());
		System.out.println(i1.getNickname());

	}

}
