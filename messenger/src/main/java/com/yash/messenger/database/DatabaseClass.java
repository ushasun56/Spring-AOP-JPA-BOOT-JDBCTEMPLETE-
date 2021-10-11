package com.yash.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.yash.messenger.model.Employee;
import com.yash.messenger.model.Message;

public class DatabaseClass 
{
   private static Map<Long,Message> message = new HashMap<>();
   private static Map<String,Employee> employees = new HashMap<>();
   
   public static Map<Long,Message> getMessages(){
	   return message;
	   
   }
   public static Map<String,Employee> getEmployee(){
	   return employees;
   }
}
