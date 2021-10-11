package com.yash.ems.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ems.model.Employee;
import com.yash.ems.repository.EmployeeRepository;

@CrossOrigin(origins="http://localhost:8081")
@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	EmployeeRepository employeeRepository;

	@SuppressWarnings("unckecked")
	@GetMapping("/employees")//http://localhost:8081/api/employees
	public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String name) {
		try {
			List<Employee> employees = new ArrayList<Employee>();

			if (name == null)
				employeeRepository.findAll().forEach(employees::add);
			else
				employeeRepository.findbyName(name).forEach(employees::add);

			if (employees.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(employees, HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
