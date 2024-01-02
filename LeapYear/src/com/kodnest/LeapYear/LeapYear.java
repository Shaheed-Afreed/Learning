package com.kodnest.LeapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year:");
		int year=scan.nextInt();
		boolean res=isleapyear(year);
		if(res==true)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it is not leap year");
		}
		
	}
	public static boolean isleapyear(int year)
	{
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			return true;
		}
		return false;
	}
}