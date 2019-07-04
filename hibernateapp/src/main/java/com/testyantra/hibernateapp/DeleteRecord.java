package com.testyantra.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.testyantra.hibernateapp.dto.EmployeeOtherInfoBean;
import com.testyantra.hibernateapp.util.HibernateUtil;

public class DeleteRecord {
	
	public static void main(String[] args) {
		SessionFactory factory = null;
		/*
		 * Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		 * 
		 * SessionFactory factory = cfg.buildSessionFactory();
		 */
		
		factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();

		EmployeeOtherInfoBean empOtherInfoBean = session.get(EmployeeOtherInfoBean.class, 6);
		Transaction transaction = session.beginTransaction();
		
		session.delete(empOtherInfoBean);
		transaction.commit();
		session.close();

	}

}
