package com.yash.ems.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
@CrossOrigin(origins = "http://localhost:8081") 
@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		return ResponseEntity.ok().body(employeeService.getAllEmployee());
	}
    
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
		return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> createProduct(@RequestBody Employee employee){
		return ResponseEntity.ok().body(this.employeeService.createEmployee(employee));
	}
	
	@PutMapping("/employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee){
		employee.setId(id);
		return ResponseEntity.ok().body(this.employeeService.updateEmployee(employee));
	}

	@DeleteMapping("/employee/{id}")
	public HttpStatus deleteEmployee(@PathVariable long id){
		this.employeeService.deleteEmployee(id);
		return HttpStatus.OK;
	}
}
