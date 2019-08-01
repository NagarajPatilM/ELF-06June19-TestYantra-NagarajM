package com.testyantra.warehouse.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testyantra.config.HibernateConfigNew;
import com.testyantra.warehouse.beans.ItemBean;

import lombok.extern.java.Log;
@Log
public class AddItemNew {
	public static void main(String[] args) {
		/*
		 * ApplicationContext applicationContext=new
		 * ClassPathXmlApplicationContext("applicationcontext.xml"); //Session
		 * session=applicationContext.getBean("hibernateUtil",HibernateConfigNew.class).
		 * openSession();
		 * 
		 * 
		 * 
		 * ItemBean bean = new ItemBean();
		 * 
		 * Transaction txn=null; try { bean.setCost(2000000);
		 * bean.setDescription("private home"); bean.setItemId(104);
		 * bean.setName("raj"); bean.setQuantity(1); session.save(bean);
		 * log.info("PROFILE UPDATED SUCCESSFULLY");
		 * 
		 * } catch (Exception e) { e.printStackTrace(); } finally { if (session != null)
		 * { session.close(); } }
		 */
		
	}

}
