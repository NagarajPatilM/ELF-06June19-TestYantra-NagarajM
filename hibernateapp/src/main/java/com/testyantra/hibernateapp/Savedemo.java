package com.testyantra.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.testyantra.hibernateapp.dto.EmployeeInfoBean;
import com.testyantra.hibernateapp.dto.EmployeeOtherInfoBean;

public class Savedemo {

	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		EmployeeOtherInfoBean empOtherInfo = new EmployeeOtherInfoBean();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse("2018-02-07");
		/*
		 * empInfo.setId(16); empInfo.setAccountNo(13256276); empInfo.setHiredate(date);
		 * empInfo.setAge(23); empInfo.setDeptId(50);
		 * empInfo.setDesignation("developer"); empInfo.setDob(date);
		 * empInfo.setEmail("chahal@34"); empInfo.setGender("male");
		 * empInfo.setMngrId(3); empInfo.setName("chahal");
		 * empInfo.setPhoneNo(936782382); empInfo.setSalary(60000);
		 */

		empOtherInfo.setAadhaar(1252627);
		empOtherInfo.setBloodGrp("a positive");
		empOtherInfo.setEmergencContactNo(25623778);
		empOtherInfo.setEmergencyContactName("avf");
		empOtherInfo.setFatherNm("sgfg");
		empOtherInfo.setId(8);
		empOtherInfo.setIsChallenged(false);
		empOtherInfo.setIsmarried(true);
		empOtherInfo.setMotherNm("ghsj");
		empOtherInfo.setNationality("German");
		empOtherInfo.setPan("gs67hnhjs8");
		empOtherInfo.setPassport("ghs7889");
		empOtherInfo.setReligion("hindu");

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(empOtherInfo);
		transaction.commit();
		session.close();

	}

}
