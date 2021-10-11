package com.yash.spring.aop.ems.service;

/**
 * service class for the employee and address
 */

import com.yash.spring.aop.ems.model.Employee;

public class EmployeeService {
	public Employee employee;


	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

}
