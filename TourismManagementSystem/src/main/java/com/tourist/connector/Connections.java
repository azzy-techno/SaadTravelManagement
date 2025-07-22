package com.tourist.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
 static Connection con;
	public static Connection connector() {
		String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12791183";
		String user = "sql12791183";
		String pass = "yjYzFGytrm";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
