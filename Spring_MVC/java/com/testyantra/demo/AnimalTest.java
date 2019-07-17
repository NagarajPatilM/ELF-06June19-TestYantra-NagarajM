package com.testyantra.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Pet.class);
		Pet pet = (Pet) applicationContext.getBean(Pet.class);

		/*
		 * Animal animal = pet.getAnimal(); animal.eat();
		 */

		pet.something();
	}

}

