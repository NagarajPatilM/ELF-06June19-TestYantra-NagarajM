package com.testyantra.hibernate.crudoperations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.testyantra.hibernate.dto.CustomerBean;
import com.testyantra.hibernate.util.HiberbnateUtil;

import lombok.extern.java.Log;

@Log
public class CustomerCreate {

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

			session.saveOrUpdate(customerBean);
			transaction = session.beginTransaction();
			transaction.commit();
			log.info("customer created successfully");

		}
		if (transaction != null) {
			transaction.rollback();
			log.info("transaction is rollbacked!!");
		}
	}

}
