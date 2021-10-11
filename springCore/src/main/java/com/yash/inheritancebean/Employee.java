package com.yash.inheritancebean;

/**
 * inhitance bean
 * 
 * @author usha.more
 *
 */

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address address;

	/**
	 * default constructor
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @param id
	 * @param name
	 * @param salary
	 * @param address
	 */
	public Employee(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public void show() {
		System.out.println("id:" + id + "\nname:" + name + "\nsalary:" + salary);
		System.out.println(address);
	}

}
