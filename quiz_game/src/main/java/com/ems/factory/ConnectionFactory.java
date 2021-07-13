package com.ems.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection con=null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysqlatul.cbihccs2k4x9.ap-south-1.rds.amazonaws.com:3306/quizdb?verifyServerCertificate=false&useSSL=false", "mysqlatul", "mysqlatul");
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb","root","root");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
