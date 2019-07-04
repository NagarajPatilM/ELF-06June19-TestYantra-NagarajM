package com.testyantra.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.testyantra.xmlexample.dto.DepartmentInfoBean;

public class Savedemo {

	public static void main(String[] args) throws Exception {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
//		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		DepartmentInfoBean deptInfo = new DepartmentInfoBean();

		deptInfo.setDeptId(33);
		deptInfo.setDeptName("research");

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(deptInfo);
		transaction.commit();
		session.close();

	}

}
