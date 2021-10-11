package com.yash.DI.by.ConstructorDObject;

/**
 * Constructor injection with dependent object Employee is dependent on Address
 * class Employee HAS-A relation with Address
 * 
 * @author usha.more
 *
 */

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address address;// Address class define seperat

	/**
	 * default Constructor
	 */
	public Employee() {
		super();
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

	void show() {
		System.out.println("id:" + id + "\nname:" + name + "\nsalary:" + salary);
		System.out.println(address.toString());
	}

}
