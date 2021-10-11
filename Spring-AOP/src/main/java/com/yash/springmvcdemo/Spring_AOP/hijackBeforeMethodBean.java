package com.yash.springmvcdemo.Spring_AOP;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class hijackBeforeMethodBean implements MethodBeforeAdvice
{
	Logger logger=Logger.getAnonymousLogger();
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		logger.info("HijackBeforeMethod : BeforeMethod" );
		
	}
	

}
