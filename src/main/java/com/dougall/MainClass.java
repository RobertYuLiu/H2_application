package com.dougall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		String url = "jdbc:h2:mem:";
		try {
			Connection connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select 1+1+2+3");
			
			while(result.next()) {
				System.out.println(result.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
