package com.yash.springbean.lifecycle.xml;
/**
 * implimented life cycle of bean 
 * @author usha.more
 *
 */

public class WelcomeSpringLifeCycle 
{
	 public void init() throws Exception
	    {
	        System.out.println(
	            "welcome to spring life cycle  "
	            + "instantiated and I'm"
	            + "the init() method");
	    }	
	 
	 public void destroy() throws Exception
	    {
	        System.out.println(
	            "Container has been closed "
	            + "and I'm the destroy() method");
	    }

}
