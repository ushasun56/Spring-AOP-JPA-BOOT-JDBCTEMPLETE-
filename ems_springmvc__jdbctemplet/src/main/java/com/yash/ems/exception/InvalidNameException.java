package com.yash.ems.exception;
/**
 * handle Exception by user define;
 * if Employee Name not  and invalid input tacken by user  then this exception accured;
 * @author abhishek.maurya
 *
 */

public class InvalidNameException extends Exception
{

	public InvalidNameException(String msg) 
	{
		super(msg);
	}
}
