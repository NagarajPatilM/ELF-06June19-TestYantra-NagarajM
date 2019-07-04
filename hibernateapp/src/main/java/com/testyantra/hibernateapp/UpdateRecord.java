package com.testyantra.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.testyantra.hibernateapp.dto.EmployeeOtherInfoBean;
import com.testyantra.hibernateapp.util.HibernateUtil;

public class UpdateRecord {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean empOtherInfo = session.get(EmployeeOtherInfoBean.class, 20);

		empOtherInfo.setNationality("Japanese");
		Transaction transaction = session.beginTransaction();
		session.update(empOtherInfo);
		transaction.commit();
		session.close();

	}

}
