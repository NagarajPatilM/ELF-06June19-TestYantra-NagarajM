package com.testyantra.assessmentone;

import java.util.ArrayList;
import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class AnimalObjectCount {

	public static void main(String[] args) {
		ArrayList<Animal> al = new ArrayList<>();
		al.add(new Dog());
		al.add(new Cow());
		al.add(new Dog());
		al.add(new Cow());
		al.add(new Dog());
		al.add(new Dog());
		al.add(new Dog());
		al.add(new Dog());
		al.add(new Dog());
		al.add(new Dog());
		al.add(new Dog());
		al.add(new Dog());
		al.add(new Cat());

		Predicate<Animal> predicateOne = (a) -> a instanceof Cow;
		Predicate<Animal> predicateTwo = (a) -> a instanceof Dog;
		Predicate<Animal> predicateThree = (a) -> a instanceof Cat;

		log.info("cowCount= " + al.stream().filter(predicateOne).count());
		log.info("DogCount= " + al.stream().filter(predicateTwo).count());
		log.info("CatCount= " + al.stream().filter(predicateThree).count());

	}

}
