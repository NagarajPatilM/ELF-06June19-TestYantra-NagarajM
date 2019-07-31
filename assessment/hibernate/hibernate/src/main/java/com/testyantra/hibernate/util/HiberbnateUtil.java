package com.testyantra.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.testyantra.hibernate.dto.CustomerBean;
import com.testyantra.hibernate.dto.StudentsInfoBean;
import com.testyantra.hibernate.dto.StudentsOtherInfoBean;

public class HiberbnateUtil {

	private HiberbnateUtil() {
	}

	private static SessionFactory sessionFactory = null;

	private static SessionFactory buildSessionFactory() {
		/*
		 * return new
		 * Configuration().configure().addAnnotatedClass(StudentsInfoBean.class)
		 * .addAnnotatedClass(StudentsOtherInfoBean.class).buildSessionFactory();
		 */

		return new Configuration()
				.configure()
				.addAnnotatedClass(CustomerBean.class)
				.buildSessionFactory();
	}

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			return buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session openSession() {
		return getSessionFactory().openSession();
	}

} // End of class
