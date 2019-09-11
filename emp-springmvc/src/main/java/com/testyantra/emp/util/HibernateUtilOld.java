package com.testyantra.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtilOld {

	private static SessionFactory factory = null;
	
	private HibernateUtilOld() {}

	private static SessionFactory buildSessionFactory() {
		return  new Configuration().configure().buildSessionFactory();
	}

	private static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory=buildSessionFactory();
			return factory;
		}
		return factory;
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}