package com.testyantra.hibernate.crudoperations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.testyantra.hibernate.dto.CustomerBean;
import com.testyantra.hibernate.util.HiberbnateUtil;

import lombok.extern.java.Log;

@Log
public class CustomerDelete {

	public static void main(String[] args) {
		Transaction transaction = null;
		CustomerBean customerBean = new CustomerBean();
		customerBean.setId(100);
		customerBean.setAddress("near chennamma circle");
		customerBean.setCity("hubballi");
		customerBean.setContactNo(1234556);
		customerBean.setFirstName("nagaraj");
		customerBean.setLastName("m");
		customerBean.setState("karnataka");

		try (Session session = HiberbnateUtil.openSession();) {
			transaction = session.beginTransaction();
			customerBean = session.get(CustomerBean.class, 100);
			session.delete(customerBean);
			transaction.commit();
			log.info("customer deleted a successfully");
		} catch (Exception e) {
			if(transaction!=null) {
				//transaction.rollback();
				log.info("transaction is rollbacked!!");
			}
			
		}

	}

}
