package com.testyantra.hibernateapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.testyantra.hibernateapp.onetoone.EmployeeInfoBean;
import com.testyantra.hibernateapp.dto.EmployeeOtherInfoBean;

public class HibernateUtil {

	private static SessionFactory factory = null;

	public static SessionFactory buildSessionFactory() {

		return new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(EmployeeOtherInfoBean.class).buildSessionFactory();
		/*
		 * return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(
		 * EmployeeInfoBean.class)
		 * .addAnnotatedClass(EmployeeOtherInfoBean.class).buildSessionFactory();
		 */


		/*
		 * Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		 * SessionFactory factory = cfg.buildSessionFactory(); return factory;
		 */
	}

	public static SessionFactory getSessionFactory() {
		if (factory == null)
			factory = buildSessionFactory();
		return factory;
	}

	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
