package com.testyantra.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.testyantra.hibernate.dto.StudentsInfoBean;
import com.testyantra.hibernate.util.HiberbnateUtil;
import com.testyantra.hibernate.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	static Transaction transaction = null;
	static Session session = null;

	public static void main(String[] args) {
		int rollNo=4;
		StudentsInfoBean infoBean = PrepareDataUtil.prepareData(rollNo);
		save(infoBean);
	}

	public static void save(StudentsInfoBean infoBean) {

		try {
			Session session = HiberbnateUtil.openSession();
			transaction = session.beginTransaction();
			session.save(infoBean);
			transaction.commit();
			log.info("successfull");

		} catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}

		}

	}

}
