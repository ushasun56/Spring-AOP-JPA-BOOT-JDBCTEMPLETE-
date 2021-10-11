package com.yash.DI.by.ConstructorDObject;

/**
 * Constructor injection with dependent object address is help for employee
 * class Employee HAS-A relation with Address
 * 
 * @author usha.more
 *
 */

public class Address {
	private String city;
	private int pincode;
	private String state;
	private String country;

	/**
	 * default constructor
	 */
	public Address() {
		super();
	}

	/**
	 * @param city
	 * @param pincode
	 * @param state
	 * @param country
	 */
	public Address(String city, int pincode, String state, String country) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", state=" + state + ", country=" + country + "]";
	}

}
