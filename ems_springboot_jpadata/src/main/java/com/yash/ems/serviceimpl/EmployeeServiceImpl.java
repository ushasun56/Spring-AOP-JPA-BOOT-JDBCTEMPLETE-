package com.yash.ems.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ems.exception.ResourceNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.repository.EmployeeRepository;
import com.yash.ems.service.EmployeeService;

/**
 * impliments all method in this class from employeeservice layer
 * @author usha.more
 *
 */
@Service
@Transactional
public class EmployeeServiceImpl  implements EmployeeService
{
   /**
    * inject the object of EmployeeRepository
    */
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
        Optional<Employee> employeeDb = this.employeeRepository.findById(employee.getId());
		
		if(employeeDb .isPresent()) {
			Employee employeeUpdate = employeeDb .get();
			employeeUpdate.setId(employee.getId());
			employeeUpdate.setName(employee.getName());
			employeeUpdate.setdesignation(employee.getdesignation());
			employeeUpdate.setSalary(employee.getSalary());
			employeeUpdate.setDepartment(employee.getDepartment());
			employeeUpdate.setAddress(employee.getAddress());
			employeeRepository.save(employeeUpdate);
			return employeeUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + employee.getId());
		}		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long EmployeeId) {
		Optional<Employee> employeeDb = this.employeeRepository.findById(EmployeeId);
		if(employeeDb.isPresent()) {
			return employeeDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + EmployeeId);
		}
	}

	@Override
	public void deleteEmployee(long id) {
		Optional<Employee> employeeDb = this.employeeRepository.findById(id);
		if(employeeDb.isPresent()) {
			this.employeeRepository.delete(employeeDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id : " +id);
		}
		
	}
	

}
