package com.yash.springmvcdemo.Spring_AOP;

import java.util.logging.Logger;

/**
 * model class employee which have is,name,address attributes
 * @author usha.more
 *
 */

public class Employee 
{ 
	Logger logger=Logger.getAnonymousLogger();
	
	/**
	 * name for employee
	 */
	private String name;
	/**
	 * address for employee
	 */
	private String address;
	
	
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
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * toString method for the employee attributes
	 */
	@Override
	public String toString() {
		return "Employee [ name=" + name + ", address=" + address + "]";
	}
	
	
	/**
	 * methods for the employee 
	 */
	public void printName() {
		logger.info("employee name :"+this.name);
	}
	
	public void printaddress() {
		logger.info("employee address:"+this.address);
	}
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
	

}
