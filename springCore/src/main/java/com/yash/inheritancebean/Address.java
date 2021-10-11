package com.yash.inheritancebean;

public class Address 
{
	private String city;
	private int pincode;
	private String state;
	private String country;
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
