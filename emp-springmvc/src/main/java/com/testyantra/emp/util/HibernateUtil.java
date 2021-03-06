package com.testyantra.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {

	@Autowired
	private  SessionFactory sessionFactory = null;
	
	/*
	 * private HibernateUtil() {}
	 * 
	 * private static SessionFactory buildSessionFactory() { return new
	 * Configuration().configure().buildSessionFactory(); }
	 * 
	 * private static SessionFactory getSessionFactory() { if(factory == null) {
	 * factory=buildSessionFactory(); return factory; } return factory; }
	 */
	
	public  Session openSession() {
		return sessionFactory.openSession();
	}
}
