package com.yash.spring.aop.ems.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * class for the aspect implimentation
 * 
 * @author usha.more
 *
 */

@Aspect // convert normal class into Aspect
public class LoggingAspect {
	Logger logger = Logger.getAnonymousLogger();
	/**
	 * aspect method
	 */
	/**
	 * expression with getname() meyhod
	 */
//	@Before("execution(public String getName())")
	/**
	 * expression with passing class name or package name
	 */

	// @Before("execution(public String
	// com.yash.spring.aop.ems.model.Employee.getName())")
	/**
	 * no need to write public or String we write * here
	 */
	/*
	 * @Before("execution(* get*())") public void LoggingAdvice() {
	 * logger.info("Advice is run and get method called"); }
	 */

	/*
	 * @Before("allEmployeeMethods() && allGetters()") public void LoggingAdvice1()
	 * { logger.info("Advice is run and get method called"); }
	 */

	@Before("allEmployeeMethods()")
	public void LoggingAdvice2(JoinPoint joinPoint) {
		logger.info(joinPoint.toString());
	}

	@Pointcut("execution(public String getName())")
	public void allGetters() {
		// dummy method hold ponitcuts into allgetter() methods
	}

	@Pointcut("within(com.yash.spring.aop.ems.model.Employee)")
	public void allEmployeeMethods() {
		// dummy method hold ponitcuts into allgetter() methods
	}
	
	@AfterReturning("args(name)")
	public void stringMethod(String name) {
		logger.info("A method taht tack String arguments has been called. the value is "+name);
	}
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		logger.info("An Exception has been thrown");
	}
	
	@Around("allEmployeeMethods()")
	public Object myaround(ProceedingJoinPoint proceedingjoinpoint) {
		 Object returnValue = null;
		try {
			logger.info("Before around advice");
			returnValue =	proceedingjoinpoint.proceed();
			logger.info("After returning");
		} catch (Throwable e) {
		      
		logger.info("after Throwing");
		}
		logger.info("after Finally");
		return returnValue;
	}

}
