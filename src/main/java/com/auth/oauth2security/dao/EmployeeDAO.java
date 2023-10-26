package com.auth.oauth2security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.oauth2security.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

	Employee findByEmailId(String emailId);
	
	Employee findByEmailIdIgnoreCase(String emailId);

}
