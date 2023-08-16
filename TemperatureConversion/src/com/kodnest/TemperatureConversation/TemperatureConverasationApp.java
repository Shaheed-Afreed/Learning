package com.kodnest.TemperatureConversation;

import java.util.Scanner;

public class TemperatureConverasationApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Temperature Conversion Tool!");
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your choice:");
		
		int num=scan.nextInt();
		switch(num)
		{
		case 1:
		{
			System.out.println("Enter the temperature in Celsius");
			int celsius=scan.nextInt();
			double res=TemperatureConversation.celsiusToFahrenheit(celsius);
			System.out.println(celsius+"C is equivalent to "+res+"f");
			
			break;
		
		}
		case 2:
		{
			System.out.println("Enter the temperature in Fahrenheit");
			int  fahrenheit=scan.nextInt();
			double res1=TemperatureConversation.fahrenheitToCelsius (fahrenheit);
			System.out.println(fahrenheit+"f is equivalent to "+res1+"c");
			break;
			
		}
		default:
			System.out.println("sorry....");
		}
		
		

	}

}
