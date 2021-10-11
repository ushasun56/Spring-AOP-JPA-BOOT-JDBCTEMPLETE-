package com.yash.ems.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.ems.model.Employee;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

@Controller
@RequestMapping(value="/")
public class EmployeeController 
{
	
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject(mav);
		return mav;
		
	}
	
	/* @Autowired
	    private EmployeeServiceImpl employeeservice;
      
	 @RequestMapping(value = "/list",method = RequestMethod.GET)
		public String getList(ModelMap model) 
		{
			List<Employee> emplist = employeeservice.listAll();
			model.addAttribute("emplist", emplist);
			return "empllist";
		}*/
	 
	 
}
