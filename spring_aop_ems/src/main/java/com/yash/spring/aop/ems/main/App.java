package com.yash.spring.aop.ems.main;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.yash.spring.aop.ems.service.EmployeeService;


public class App {
  public static void main(String[] args) {
	  Logger logger=Logger.getAnonymousLogger();
	  ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
      EmployeeService empService= context.getBean("empService",EmployeeService.class);
      empService.getEmployee().setName("soham");
    
    
  }
}
