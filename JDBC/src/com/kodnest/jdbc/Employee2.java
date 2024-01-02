package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee2 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="Root";
		String query="update employee set emp_name=? where emp_id=? ";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the employee name");
			String emp_name=scan.next();
			System.out.println("enter the employee id");
			int emp_id=scan.nextInt();
			
			pstmt.setString(1, emp_name);
			pstmt.setInt(2, emp_id);
			
			
			pstmt.executeUpdate();
			System.out.println("rows are updated");
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
