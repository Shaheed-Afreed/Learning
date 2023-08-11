package com.kodnest.Temperature;

public class TemperatureConverter {
	public double convertFahrenheitToCelsius(double fahrenheit)
	{
		double celcius = (fahrenheit - 32) * 5/9 ;
		return celcius;
	}

}
