package com.onlineproperty.DAOS;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtils 
{
	private static Connection connection;
	public static Connection getConnection( )throws Exception 
	{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/property?useSSL=false", "root", "");
		return connection;
	}
	public static void closeConnection( )throws Exception
	{
		if( connection != null )
			connection.close();
	}
}

