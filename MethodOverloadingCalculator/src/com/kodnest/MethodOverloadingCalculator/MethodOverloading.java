package com.kodnest.MethodOverloadingCalculator;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float a=scan.nextFloat();
		System.out.println("enter the second number: ");
		float b=scan.nextFloat();
		System.out.println("enter the operator");
		char operator=scan.next().charAt(0) ;
		scan.close();
		switch(operator)
		{
		   case '+':
			
			System.out.println("result: " +calculate(a,b));
			
			break;
		   case'-':
			System.out.println("result: "+calculate(a,b,operator));
					break;
			case '*':
			System.out.println("result: "+calculate(a,b,operator,operator));
			break;
			case '/':
			System.out.println("result: "+calculate(a,b,operator,operator,operator));
			break;
			default:
				System.out.println("error");
		}
		

	}
	public static float calculate(float a,float b)
	{
		float res=a+b;
		return res;
	}
	public static float calculate(float a,float b, char operator)
	{
		float res1=a-b;
		return res1;
	}
	public static float calculate(float a,float b,char operator,char operator1)
	{
		float res2=(float) (a*b);
		return res2;  
	}
	public static float calculate(float a,float b,char operator,char operator1,char operator2)
	{
		float res3=a/b;
		return res3;
	}
	

}
