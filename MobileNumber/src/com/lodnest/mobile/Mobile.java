package com.lodnest.mobile;

import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the mobile number");
String mobile=scan.next();
if(mobile.length()==10&& mobile.charAt(0)=='9'||mobile.charAt(0)=='8'||mobile.charAt(0)=='7')
{
	System.out.println(mobile+" is valid number");
}
else
{
	System.out.println(mobile+" is not valid number");
}
	}

}
