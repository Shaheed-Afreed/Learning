package com.kodnest.Delimma;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no to perform operation");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("enter the valve between 1and 4");
		int num=scan.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Addition result is "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction result is "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication Result is "+(a*b));
			break;
		case 4:
			System.out.println( "Division result is "+(a/b));
			break;
			default:
				System.out.println("Sorry.....only four operation can perform");
		}
	}

}
