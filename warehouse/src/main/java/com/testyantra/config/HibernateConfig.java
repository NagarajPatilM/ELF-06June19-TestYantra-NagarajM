package com.testyantra.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration

public class HibernateConfig {
	
	@Bean
	public SessionFactory getSessionFactory() {
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		return sessionfactory;
	}

}
