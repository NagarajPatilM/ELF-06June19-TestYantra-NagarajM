package com.testyantra.hibernateapp.onetoone;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.testyantra.hibernateapp.util.HibernateUtil;
import com.testyantra.hibernateapp.util.PrepareDataUtil;

//import com.testyantra.hibernateapp.dto.EmployeeOtherInfoBean;

public class HibernateOneToOneTest {

	public static void main(String[] args) throws ParseException {

		// prepare data
		int id = 338;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
	}

	public static void save(EmployeeInfoBean infoBean) {
		Transaction txn = null;
		// save
		try (Session session = HibernateUtil.openSession()) {
			txn = session.beginTransaction();
			session.save(infoBean);
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}

		}
	}

}// End of class
