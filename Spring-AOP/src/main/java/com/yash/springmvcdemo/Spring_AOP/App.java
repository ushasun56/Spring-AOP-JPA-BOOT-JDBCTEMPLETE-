package com.yash.springmvcdemo.Spring_AOP;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Logger logger=Logger.getAnonymousLogger();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Emp.xml");
		Employee emp =(Employee) appContext.getBean("employeeProxy");
		


		logger.info("***********");
		emp.printName();
		logger.info("***********");
		emp.printaddress();
	
		try {
			emp.printThrowException();
		} catch (Exception e) {

		}
	}
}