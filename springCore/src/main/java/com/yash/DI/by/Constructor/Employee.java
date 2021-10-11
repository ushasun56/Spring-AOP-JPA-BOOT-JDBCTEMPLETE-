package com.yash.DI.by.Constructor;



public class Employee 
{
	

   
      private int id;
      private String name;
      private String Address;
      private String designation;
      private double salary;
	
      
      public Employee() {
		super();
	}


	public Employee(int id) {
		super();
		this.id = id;
	}
	
	


	public Employee(String name) {
		super();
		this.name = name;
	}
	
	


	public Employee(double salary) {
		super();
		this.salary = salary;
	}
	
	


	

	public Employee(int id, String name, String address, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.Address = address;
		this.designation = designation;
		this.salary = salary;
	}
	
	
         public void show() {
		System.out.println("id:" +id+ "\nname:" +name+ "\nAddress:" +Address+ "\ndesignation:" +designation+ "\nsalary:" +salary);
	}

 	
 	
      
      
      
      
}
