package com.yash.springbean.lifecycle.program;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)  throws Exception
	  {
	 
	         ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("Spring1.xml");
	           cap.close();
	    }

		

	

}
