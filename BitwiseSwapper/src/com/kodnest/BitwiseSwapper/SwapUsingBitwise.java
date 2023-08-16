package com.kodnest.BitwiseSwapper;

import java.util.Scanner;

public class SwapUsingBitwise {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
		scan.close();
		
		swapUsingBitwise( a, b);
		

	}
	public static void swapUsingBitwise(int a,int b)
	{
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("after swapping:"+"first "+a+" "+"second "+b);
	}

}
