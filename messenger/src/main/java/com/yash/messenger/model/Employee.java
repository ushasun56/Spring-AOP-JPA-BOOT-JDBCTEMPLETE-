 package com.yash.messenger.model;

import java.util.Date;

public class Employee
{
	private  long id;
	private String FName;
	private String LName;
	private double salary;
	private Date created;
	
	public Employee() {
		super();
	}

	public Employee(long id, String fName, String lName, double salary) {
		super();
		this.id = id;
		this.FName = fName;
		this.LName = lName;
		this.salary = salary;
		this.created = new Date();
	}

	public  long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", FName=" + FName + ", LName=" + LName + ", salary=" + salary + ", created="
				+ created + "]";
	}

	
	
	
	 
	
	

}
