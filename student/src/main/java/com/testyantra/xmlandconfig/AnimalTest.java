package com.testyantra.xmlandconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlandconfig.xml");
		Pet pet = (Pet) applicationContext.getBean("pet");

		/*
		 * Animal animal = pet.getAnimal(); animal.eat();
		 */

		pet.something();
	}

}

