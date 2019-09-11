package com.testyantra.mywebapp.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.testyantra.mywebapp.beans.EmployeeInfoBean;
import com.testyantra.mywebapp.util.HibernateUtil;



public class EmployeeDAOHibernateImplTwo implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session=HibernateUtil.openSession();
		Query query=session.createQuery("from EmployeeInfoBean");
		
		return (ArrayList<EmployeeInfoBean>) query.list();
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}

	private boolean SaveOrUpdate(EmployeeInfoBean bean) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return SaveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return SaveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
			session.delete(bean);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}