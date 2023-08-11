package com.kodnest.question;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(subtractNumbers(num1, num2));
		System.out.println("enter the two number");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println( multiplyNumbers( num1, num2));
		System.out.println("enter the two number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(divideNumbers( num1, num2));	
		System.out.println("enter the two number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(findRemainder(num1, num2));
		
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}

	

}
