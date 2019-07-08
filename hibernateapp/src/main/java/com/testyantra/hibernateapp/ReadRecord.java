package com.testyantra.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.testyantra.hibernateapp.dto.EmployeeOtherInfoBean;
import com.testyantra.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadRecord {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean empOtherInfo = new EmployeeOtherInfoBean();
		empOtherInfo = session.get(EmployeeOtherInfoBean.class, 1);
		log.info(" " + empOtherInfo.getId());
		log.info(" " + empOtherInfo.getFatherNm());
		log.info(" " + empOtherInfo.getMotherNm());
		log.info(" " + empOtherInfo.getIsChallenged());
		log.info(" " + empOtherInfo.getBloodGrp());
		log.info(" " + empOtherInfo.getNationality());
		log.info(" " + empOtherInfo.getPan());
		log.info(" " + empOtherInfo.getPassport());
		log.info(" "+empOtherInfo.getReligion());
		log.info(" "+empOtherInfo.getSpouseNm());
		log.info(" "+empOtherInfo.getIsmarried());

	}

}
