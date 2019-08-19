package com.testyantra.emp.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.testyantra.emp.springboot.dto.EmployeeInfoBean;
import com.testyantra.emp.springboot.dto.EmployeeOtherInfoBean;

/*This interface acts like EmployeeDAOP
*/
public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer>{

	@Query("select e from EmployeeOtherInfoBean e where e.infoBean=:id")
	public EmployeeOtherInfoBean findByEmpId(@Param("id") EmployeeInfoBean id);
}
