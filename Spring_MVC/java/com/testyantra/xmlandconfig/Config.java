package com.testyantra.xmlandconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	
	//@Bean(name="donkey")
	@Primary
	public Animal getDonkey() {
		return new Donkey();
	}
	
	//@Bean(name="monkey")
	public Animal getMonkey() {
		return new Monkey();
	}
	
	@Bean
	public Pet getPet() {
		return new Pet();
	}

}
