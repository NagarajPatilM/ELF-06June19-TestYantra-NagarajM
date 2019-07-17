package com.testyantra.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="donkey")
	public Animal getDonkey() {
		return new Donkey();
	}
	
	@Bean(name="monkey")
	public Animal getMonkey() {
		return new Monkey();
	}
	
	@Bean
	public Pet getPet() {
		return new Pet();
	}

}
