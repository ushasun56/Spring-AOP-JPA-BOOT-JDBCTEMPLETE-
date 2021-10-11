package com.yash.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yash.messenger.database.DatabaseClass;
import com.yash.messenger.model.Employee;


public class EmployeeService 
{
	private Map<String,Employee> employee = DatabaseClass.getEmployee();
	
	public List<Employee> getAllEmployee(){
		return new ArrayList<Employee>(employee.values());
	}
	
	public Employee getEmployee(String FName) {
		return employee.get(FName);
	}
	
	public Employee addEmployee(Employee employees) {
		employees.setId(employee.size() + 1);
		employee.put(employees.getFName(), employees);
		return employees;
		
	}
	 
		
}
