package com.testyantra.libmgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.testyantra.libmgmt.dto.UserBean;

public interface UserRepository extends CrudRepository<UserBean, Integer>{
	@Query("select u from UserBean u where u.email=:email")
	public UserBean findByEmail(String email);
	@Query("select u from UserBean u where u.firstName LIKE CONCAT('%', :name,'%')")
	public List<UserBean> findByFirstName(String name);
}
