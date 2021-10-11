package com.yash.ems.util;
/**
 * JDBC Connection with mysql database 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConn()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/project";
			Connection con = (Connection) DriverManager.getConnection(url,"root","root");
			return con;
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		
		return null;
		
	}

}
