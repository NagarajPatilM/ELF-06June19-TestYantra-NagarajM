package com.testyantra.hibernate.crudoperations;

import org.hibernate.Session;

import com.testyantra.hibernate.dto.CustomerBean;
import com.testyantra.hibernate.util.HiberbnateUtil;

import lombok.extern.java.Log;
@Log
public class CustomerRead {
	
	public static void main(String[] args) {
	
		CustomerBean customerBean=new CustomerBean();
		customerBean.setId(100);
		customerBean.setAddress("near chennamma circle");
		customerBean.setCity("hubballi");
		customerBean.setContactNo(1234556);
		customerBean.setFirstName("nagaraj");
		customerBean.setLastName("m");
		customerBean.setState("karnataka");
		
		Session session=HiberbnateUtil.openSession();
		
	   customerBean=session.get(CustomerBean.class, 100);
	    log.info(" "+customerBean.getId());
		log.info(" "+customerBean.getAddress());
		log.info(" "+customerBean.getCity());
		log.info(" "+customerBean.getContactNo());
		log.info(" "+customerBean.getFirstName());
		
	}

}
