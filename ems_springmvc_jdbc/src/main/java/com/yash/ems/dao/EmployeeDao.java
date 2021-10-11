package com.yash.ems.dao;

import java.util.List;

import com.yash.ems.model.Employee;

/**
 * Employee Interface for declaring methods of CRUD
 * 
 * @author usha.more
 *
 */

public interface EmployeeDao {
	/*
	 * this save method is used for inserting records into table employee
	 */
	public void save(Employee employee);

	/*
	 * this findAll method is used for fetching records from Employee table
	 */
	public List<Employee> findAll();

	/*
	 * this update method is used for updating records into table employee
	 */
	public void update(Employee employee);

	/*
	 * this delete method is used for deleting records from employee table
	 */
	public void delete(int id);
}
