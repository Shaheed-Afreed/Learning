package com.kodnest.LogicalOperatorValidation;

import java.util.Scanner;

public class LogicalOperatorValidation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid (true/false)");
		boolean valid=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false)");
		boolean condition=scan.nextBoolean();
		boolean result=isValidInput(valid,condition);
		if(result==true)
		{
			System.out.println("input is valid ");
		}
		else
		{
			System.out.println("input is invalid");
		}
		
		
		

	}
	public static boolean isValidInput(boolean valid,boolean condition)
	{
	if	(valid==true && condition==true)
				return true;
	else 
		return false;
			 
	}

}
