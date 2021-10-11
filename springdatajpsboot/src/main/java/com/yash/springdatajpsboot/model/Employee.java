package com.yash.springdatajpsboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * Employee Is POJO class to strore id,name,and desg
 * @author usha.more
 *
 */
@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/**
	 * Id for Employee
	 */
	long id;
	@NotNull
	@Column(name="name")
	String name;
	@Column(name="desg")
	String desg;
	
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	

	/**
	 * @param name
	 * @param desg
	 */
	public Employee(String name, String desg) {
		super();
		this.name = name;
		this.desg = desg;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
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
	 * @return the desg
	 */
	public String getDesg() {
		return desg;
	}
	/**
	 * @param desg the desg to set
	 */
	public void setDesg(String desg) {
		this.desg = desg;
	}
    /**
     * tostring method for the id,name,desg
     */

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + "]";
	}
	
	
    
}
