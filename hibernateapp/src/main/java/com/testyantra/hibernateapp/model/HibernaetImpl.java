package com.testyantra.hibernateapp.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.testyantra.hibernate.manytoone.EmployeeAddressInfoBean;
import com.testyantra.hibernate.manytoone.EmployeeEducationInfoBean;
import com.testyantra.hibernate.manytoone.EmployeeExperienceInfoBean;
import com.testyantra.hibernateapp.onetoone.EmployeeInfoBean;
import com.testyantra.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class HibernaetImpl {

	private Configuration config = new Configuration();

	private SessionFactory factory = config.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			                              List<EmployeeAddressInfoBean> addressInfo, 
			                              List<EmployeeEducationInfoBean> educationInfo,
			                              List<EmployeeExperienceInfoBean> experienceInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		// session.save(addressInfo);
		for (EmployeeAddressInfoBean addressInfoBean : addressInfo) {
			session.save(addressInfoBean);
		}
		for (EmployeeEducationInfoBean educationInfoBeans : educationInfo) {
			session.save(educationInfoBeans);
		}

		for (EmployeeExperienceInfoBean experienceInfoBeans : experienceInfoBean) {
			session.save(experienceInfoBeans);
		}
		transaction.commit();
		session.close();

	}
}
