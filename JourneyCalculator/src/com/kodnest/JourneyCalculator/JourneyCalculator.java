package com.kodnest.JourneyCalculator;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed and time ");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		scan.close();
		JourneyCalculatorApp journeyCalculator=new JourneyCalculatorApp();
		double distance= journeyCalculator.calculateDistance(speed, time);
		System.out.println(distance);
		
	}


}
