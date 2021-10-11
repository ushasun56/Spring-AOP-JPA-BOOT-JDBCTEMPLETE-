package com.yash.springbean.lifecycle.program;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * implimented life cycle of bean  using initializationBean and DisposableBean
 * @author usha.more
 *
 */

public class WelcomeSpringLifeCycle  implements InitializingBean,DisposableBean 
{

	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(
	            "welcome to spring life cycle  "
	            + "using afterpropertieset()"
	            + "the init() method");
		
	}
	
	 @Override
	    public void destroy() throws Exception
	    {
	        System.out.println(
	            "Container has been closed "
	            + "and I'm the destroy() method");
	    }

}
