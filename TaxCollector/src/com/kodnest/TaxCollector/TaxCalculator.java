package com.kodnest.TaxCollector;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("enter the purchase amount");	
		double purchaseAmount=scan.nextDouble();
		System.out.println("enter the tax rate");
		double taxRate=scan.nextDouble();
;		double res= calculateTotalWithTax (purchaseAmount,taxRate);
		System.out.println("total cost including tax "+res);
		scan.close();

	}
	public static double calculateTotalWithTax (double purchaseAmount, double taxRate)
	{
		double totalCost= purchaseAmount *taxRate+purchaseAmount;
		return totalCost;
	}

}
