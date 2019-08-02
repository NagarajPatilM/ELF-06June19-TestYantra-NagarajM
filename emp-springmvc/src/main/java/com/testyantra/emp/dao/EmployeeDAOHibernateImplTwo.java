package com.testyantra.emp.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.testyantra.emp.util.HibernateUtil;
import com.testyantra.emp.util.HibernateUtilOld;
import com.testyantra.empspringmvc.bean.EmployeeInfoBean;


public class EmployeeDAOHibernateImplTwo implements EmployeeDAO {
	/*
	 * @Autowired HibernateUtil hibernateUtil; //for spring way of creating
	 * SessionFactory
	 */
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session=sessionFactory.openSession();
		
		Query query=session.createQuery("from EmployeeInfoBean");
		
		return (ArrayList<EmployeeInfoBean>) query.list();
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		Session session = sessionFactory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}

	private boolean SaveOrUpdate(EmployeeInfoBean bean) {
		Transaction transaction = null;
		try {
			Session session = sessionFactory.openSession();
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
			Session session = sessionFactory.openSession();
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

	@Override
	public ArrayList<EmployeeInfoBean> getEmployeeIds(int id) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from EmployeeInfoBean b where str(b.id) like '"+id+"%'");
		return (ArrayList<EmployeeInfoBean>) query.list();
	}


}
