package com.testyantra.emp.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.testyantra.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public final class EmployeeDAOHibernateImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		List<EmployeeInfoBean> beans = null;
		try (Session session = sessionFactory.openSession();) {
			String hql = "from EmployeeInfoBean";
			Query query = session.createQuery(hql);
			beans = query.list();
		}
		return beans;

	}

	public List<EmployeeInfoBean> getAllEmployeeInfoWithRestrictions(String condition) {
		try (Session session = sessionFactory.openSession();) {
			String hql = "from EmployeeInfoBean where str(id) like :id";
			Query query = session.createQuery(hql);
//		query.setParameter("name", condition+"%");
			query.setParameter("id", condition + "%");
//		Criteria criteria = session.createCriteria(EmployeeInfoBean.class).add(Restrictions.like("id", Integer.parseInt(condition)));
			List<EmployeeInfoBean> beans = query.list();
			return beans;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}

	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		try (Session session = sessionFactory.openSession();) {

			// 3. Open Session

			// 4. Interact with the DB via Session
			EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);

			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try (Session session = sessionFactory.openSession();) {
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);

	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		// EmployeeInfoBean bean = new EmployeeInfoBean();
		// bean.setId(id);
		try (Session session = sessionFactory.openSession();) {
			EmployeeInfoBean bean = getEmployeeInfo(id);
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfoWithRestrictions(int condition) {
		return getAllEmployeeInfoWithRestrictions(condition + "");
	}

//END of getEmployeeInfo(int) method

}
