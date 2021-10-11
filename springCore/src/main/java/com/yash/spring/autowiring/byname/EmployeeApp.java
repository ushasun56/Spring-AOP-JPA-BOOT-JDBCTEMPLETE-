package com.yash.spring.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp
{
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = context.getBean("employee", Employee.class);
		emp.setId(101);
		emp.setName("Spring Framework Guru");
		emp.showEployeeDetails();
		}


}
