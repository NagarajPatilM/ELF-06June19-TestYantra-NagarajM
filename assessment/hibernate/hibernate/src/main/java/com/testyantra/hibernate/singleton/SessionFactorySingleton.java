package com.testyantra.hibernate.singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.testyantra.hibernate.dto.StudentsInfoBean;

public class SessionFactorySingleton {

	static SessionFactory factory = null;

	private SessionFactorySingleton() {
	}

	private SessionFactory buildSessionFactory() {
		return new Configuration()
				.configure()
				.addAnnotatedClass(StudentsInfoBean.class)
				.buildSessionFactory();
	}

	public SessionFactory getSessionFactory() {
		if (factory == null) {
			return buildSessionFactory();
		}
		return factory;

	}

}
