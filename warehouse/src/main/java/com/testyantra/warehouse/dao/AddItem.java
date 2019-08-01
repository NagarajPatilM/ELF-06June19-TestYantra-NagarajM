package com.testyantra.warehouse.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testyantra.config.HibernateConfig;
import com.testyantra.warehouse.beans.ItemBean;

import lombok.extern.java.Log;

@Log
public class AddItem {
	public static void main(String[] args) {
		Session session = null;
		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		session = factory.openSession();
		
		ItemBean bean = new ItemBean();
		Transaction txn=null;
		try {
			bean.setCost(2000000);
			bean.setDescription("private bungalow");
			bean.setItemId(103);
			bean.setName("raj");
			bean.setQuantity(1);
			session.save(bean);
			log.info("PROFILE UPDATED SUCCESSFULLY");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
