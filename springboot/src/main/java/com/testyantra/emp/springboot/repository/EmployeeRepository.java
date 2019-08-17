package com.testyantra.emp.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.testyantra.emp.springboot.dto.EmployeeInfoBean;

/*This interface acts like EmployeeDAOP
*/
public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer>{

}
