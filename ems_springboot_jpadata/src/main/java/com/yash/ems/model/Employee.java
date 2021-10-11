package com.yash.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee Pojo with Attribute ID,Name,Designation,Salary,Department,Address
 * 
 * @author usha.more
 *
 */
@Entity
@Table(name = "EmployeeJpa")
public class Employee {
	/**
	 * Id for Employee
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/**
	 * Name for Employee
	 */
	@Column(name = "name")
	private String name;
	/**
	 * Designation for Employee
	 */
	@Column(name = "designation")
	private String designation;
	/**
	 * Salary for Employee
	 */
	@Column(name = "salary")
	private double salary;
	/**
	 * Department for Employee
	 */
	@Column(name = "department")
	private String department;
	/**
	 * address for Employee
	 */
	@Column(name = "address")
	private String address;

	/**
	 * Default Constructor for Employee
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param salary
	 * @param department
	 * @param address
	 */
	public Employee(long id, String name, String designation, double salary, String department, String address) {
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
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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
	 * @return the description
	 */
	public String getdesignation() {
		return designation;
	}

	/**
	 * @param description the description to set
	 */
	public void setdesignation(String designation) {
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

	/**
	 * toString() method for Employee Attributes
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation+ ", salary=" + salary
				+ ", department=" + department + ", address=" + address + "]";
	}

}
