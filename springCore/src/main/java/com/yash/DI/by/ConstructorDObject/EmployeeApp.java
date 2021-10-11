package com.yash.DI.by.ConstructorDObject;
/**
 * main class of employee
 * @author usha.more
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Constructorobject.xml" });
		BeanFactory factory = context;
		Employee e =  (Employee) factory.getBean("employee");
		e.show();

	}

}
