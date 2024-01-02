package com.kodnest.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class StudentApp {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="Root";
		String query="Insert into student values(?,?,?)";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
		PreparedStatement pstmt=con.prepareStatement(query);
		
		Student st1=new Student(1,"shaheed",78);
		pstmt.setInt(1, st1.roll);
		pstmt.setString(2, st1.name);
		pstmt.setInt(3,st1.marks);
		pstmt.execute();
		
		Student st2=new Student(2,"bala",67);
		pstmt.setInt(1, st2.roll);
		pstmt.setString(2, st2.name);
		pstmt.setInt(3, st2.marks);
		pstmt.execute();
		
		Student st3=new Student(3,"agastya",87);
		pstmt.setInt(1,st3.roll );
		pstmt.setString(2, st3.name);
		pstmt.setInt(3, st3.marks);
		pstmt.execute();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
