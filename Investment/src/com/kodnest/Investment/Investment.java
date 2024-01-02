   package com.kodnest.Investment;

import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the initial investment");
float Investment=scan.nextFloat();
System.out.println("enter the rate of interest");
float rate=scan.nextFloat();
float doubleAmount=(float) (Investment*2.0);
int years=0;
while(Investment<doubleAmount)
{
	Investment=Investment*(1+rate);
	years++;
}
System.out.println(years+" years takes to double the amount"+doubleAmount);
	}

}
