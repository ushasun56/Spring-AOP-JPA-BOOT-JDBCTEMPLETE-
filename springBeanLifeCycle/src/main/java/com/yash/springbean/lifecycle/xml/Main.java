package com.yash.springbean.lifecycle.xml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.yash.springbean.lifecycle.xml.WelcomeSpringLifeCycle;

public class Main 
{
	 public static void main(String[] args)
		        throws Exception
		    {
		 
		        
		 
		        ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext(
		                "Spring.xml");
		 
		        
		        cap.close();
		    }

}
