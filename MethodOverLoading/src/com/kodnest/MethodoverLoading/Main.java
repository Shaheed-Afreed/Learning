package com.kodnest.MethodoverLoading;

public class Main {

	public static void main(String[] args) {
		teaBill();
		teaBill(5);
		teaBill("Badam milk");
		teaBill("badam milk",4);

	}
	public static void teaBill()
	{
		System.out.println("bill for the tea is 12Rs");
	}
	public static void teaBill(int n)
	{
		System.out.println("bill for the"+n+" tea is "+(n*12) );
	}
	public static void teaBill(String name)
	{
		System.out.println("bill for the bada milk is 15Rs");
	}
	public static void teaBill(String name,int n)
	{
		System.out.println("bill for the "+n+" "+name+" "+ (n*15)+"Rs");
	}

}
