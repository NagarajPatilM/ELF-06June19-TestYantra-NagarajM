package com.testyantra.designpatterns.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.testyantra.designpatterns.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfoBeans() {
		// TO DO
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		
		//1. Load config file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
       //2. Build session factory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//3. open session
		Session session = factory.openSession();
		
		//4. Interact with DB via session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		
		//5.close the session
		session.close();
		return bean;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
