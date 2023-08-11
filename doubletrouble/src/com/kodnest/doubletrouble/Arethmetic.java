package com.kodnest.doubletrouble;

import java.util.Scanner;

public class Arethmetic {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	System.out.println("enter the number to be doubled");
	int num=scan.nextInt();
	scan.close();
	System.out.println(doubleTheNumber(num));
		

	}
	public static int doubleTheNumber(int num)
	{
         return num*2;
	}
}
