package com.kodnest.ObjectOrientation;

public class ATM {
	String brand;
	String Color;
	int cost;
	
	void Deposit()
	{
		System.out.println("maximum 500000 can deposit ");
	}
	
	
	public static void main(String[] args) {
		ATM atm=new ATM();
		atm.brand="paradox";
		atm.Color="gray";
		atm.cost=1200000;
		System.out.println(atm.brand+" "+atm.Color+" "+atm.cost);
		
	}

}
