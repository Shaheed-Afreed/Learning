package com.kodnest.jdbc;
import java.sql.*;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="Root";
		String query="insert into employee values(?,?,?)";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the employee id");
			int emp_id=scan.nextInt();
			System.out.println("enter the employee name");
			String emp_name=scan.next();
			System.out.println("enter the employee salary");
			int emp_salary=scan.nextInt();
			pstmt.setInt(1, emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setInt(3, emp_salary);
			
			pstmt.execute();
			System.out.println("rows are inserted");
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
