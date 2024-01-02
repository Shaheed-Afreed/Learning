package com.kodnest.jdbc;

import java.sql.*;

public class JDBCprogram {

	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost:3306/myjdbcdb";
			String username = "root";
			String password = "Root";
			String query = "select *from student";

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("connection established successfully");

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("driver loaded");

			Statement stmt = con.createStatement();

		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
			System.out.println("query executed");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
