package com.Day34;

import java.sql.Connection;

/**
 * Main class where we check the connection and execute the method.
 */
public class JDBC {

	public static void main(String[] args) {
		Configuration config = Configuration.getInstance();
		
		Connection connection = config.getConnection();
		
		if(connection != null) 
			System.out.println(" Connection established");
		else
			System.out.println(" Connection failed");
		
		StatementDB statement = new StatementDB(connection);
		statement.update();
		statement.read();
	}
}