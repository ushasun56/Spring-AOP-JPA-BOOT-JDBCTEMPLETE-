package com.yash.DI.by.ConstructorCollection;

import java.util.Iterator;
import java.util.List;

/**
 * Constructor injection with collection one employee have multiple address
 * 
 * @author usha.more
 *
 */

public class Employee {
	private int id;
	private String name;
	private double salary;
	private List<String> address;

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
	 * @param address
	 */
	public Employee(int id, String name, double salary, List<String> address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public void show()
	{
		System.out.println("id:" + id + "\nname:" + name + "\nsalary:" + salary);
		  System.out.println("address are:");  
		    Iterator<String> itr=address.iterator();  
		    while(itr.hasNext()){  
		        System.out.println(itr.next()); 
		    }

	}

}
