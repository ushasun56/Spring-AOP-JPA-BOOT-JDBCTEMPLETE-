package com.yash.ems.service;
/**
 * service layer for employee
 */

import java.util.List;

import com.yash.ems.model.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(long EmployeeId);

	void deleteEmployee(long id);
}