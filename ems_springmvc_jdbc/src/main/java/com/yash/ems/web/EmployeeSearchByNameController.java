package com.yash.ems.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.ems.exception.InvalidNameException;
import com.yash.ems.model.Employee;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

@Controller
@RequestMapping("/searchbyname")
public class EmployeeSearchByNameController
{
EmployeeServiceImpl empser = new EmployeeServiceImpl();
	
	/*
	* This method will serve as default GET handler.
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	public String searchpage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "searchbyname";
	}
	
	/*
	* This method will be called on form submission, handling POST request..
	*/
	
	@RequestMapping(method = RequestMethod.POST)
	public String searchEmp(Employee employee,BindingResult result, ModelMap model) throws InvalidNameException
	{
		String ename = employee.getName();
		Employee e = empser.getEmployeeByName(ename);
		model.addAttribute("employee", e);
		model.addAttribute("success", "Record found !!!");
		return "success";
	}
}
