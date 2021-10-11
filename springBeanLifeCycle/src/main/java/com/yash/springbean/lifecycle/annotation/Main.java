package com.yash.springbean.lifecycle.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)  throws Exception
	  {
	 
	         ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext(
	                "Spring2.xml");
	 
	        
	        cap.close();
	    }

}
