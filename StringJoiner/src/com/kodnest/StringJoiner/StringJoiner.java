package com.kodnest.StringJoiner;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first name and last name");
		String Fname=scan.next();
		String Lname=scan.next();
		scan.close();
		System.out.println(stringJoinerApp.joinStrings( Fname, Lname));

	}

}
