package com.kodnest.Temperature;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to convert from Farenhiet to celcius");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius( fahrenheit));
		

	}

}
