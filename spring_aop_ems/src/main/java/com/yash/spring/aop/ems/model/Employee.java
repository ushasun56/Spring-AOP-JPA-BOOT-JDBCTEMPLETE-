package com.yash.spring.aop.ems.model;

import java.util.logging.Logger;

/**
 * employee model class with id,name,and address;
 * @author usha.more
 *
 */

public class Employee 
{
	Logger logger=Logger.getAnonymousLogger();
	/**
	 * name for employee
	 */
	public String name;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		logger.info("setter is called");
		throw (new RuntimeException());
		
		
	}
	
	
	
	
	

}
