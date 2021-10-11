package com.yash.ems.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Employee project created differnt properties data member
 * 
 * @author usha.more
 *
 */

public class Employee {
	
	private int id;
	@Size(min=3, max=30) 
	@NotEmpty
	private String name;
	private String designation;
	
	private double salary;
	@NotEmpty
	private String department;
	@NotEmpty
	private String address;

	/**
	 * Default Constructor
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param designation
	 * @param salary
	 * @param department
	 * @param address
	 */
	public Employee(int id, String name, String designation, double salary, String department, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", department=" + department + ", address=" + address + "]";
	}

}
