package com.yash.ems.service;

import java.util.List;
import com.yash.ems.exception.EmployeeIdNotFoundException;
import com.yash.ems.exception.InvalidNameException;
import com.yash.ems.model.Employee;

/**
 * EmployeeService Interface for declaring additional methods
 * 
 * @author usha.more
 *
 */
public interface EmployeeService {
	/*
	 * this getid method is used for getting records by id from table employee
	 */
	public Employee getEmployeeById(int empid) throws EmployeeIdNotFoundException;

	/*
	 * this getname method is used for getting records by Name from table employee
	 */
	public Employee getEmployeeByName(String empname) throws InvalidNameException;

	
	
	
}
