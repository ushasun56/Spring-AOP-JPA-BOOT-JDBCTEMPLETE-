package com.yash.springbean.lifecycle.annotation;
/**
 * implimented life cycle of bean  using Annotation
 * @author usha.more
 *
 */
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 

public class WelcomeSpringLifeCycle  
{

	
	

	 @PostConstruct
	    public void init() throws Exception
	    {
	        System.out.println(
	            "Welcome to spring life cycle using annotation @postConstruct, @preDestroy "
	            + "instantiated and I'm the "
	            + "init() method");
	    }
	
	 @PreDestroy
	    public void destroy() throws Exception
	    {
	        System.out.println(
	            "Container has been closed "
	            + "and I'm the destroy() method");
	    }

}
