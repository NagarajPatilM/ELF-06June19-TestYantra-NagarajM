package com.testyantra.assessmentone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class Topper {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("nagaraj", 35, 'M'));
		arrayList.add(new Student("virat", 40, 'M'));
		arrayList.add(new Student("shweta", 35, 'F'));
		arrayList.add(new Student("raina", 50, 'M'));
		arrayList.add(new Student("divya", 30, 'F'));

		Predicate<Student> p = b -> {
			return b.gender == 'F';
		};
		
		Comparator<Student> c = (a, b) -> {
			Integer i1 = a.marks;
			Integer i2 = b.marks;
			return i1.compareTo(i2);
		};
		
		log.info("" + arrayList.stream().sorted(c).filter(p).max(c));

	}

}
