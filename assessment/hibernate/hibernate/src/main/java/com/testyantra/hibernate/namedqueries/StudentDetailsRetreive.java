package com.testyantra.hibernate.namedqueries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.testyantra.hibernate.dto.StudentsInfoBean;
import com.testyantra.hibernate.util.HiberbnateUtil;

import lombok.extern.java.Log;

@Log
public class StudentDetailsRetreive {

	public static void main(String[] args) {
		String hql = "from StudentsInfoBean where rollNo=:rollNo";
		Session session = HiberbnateUtil.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("rollNo",  4);
		List<StudentsInfoBean> list = query.list();

		for (StudentsInfoBean bean : list) {
			log.info(" " + bean.getName());
			log.info(" " + bean.getAge());
			log.info(" " + bean.getEmailId());
			log.info(" " + bean.getMobileNo());
			log.info(" " + bean.getGender());

		}

	}

}
