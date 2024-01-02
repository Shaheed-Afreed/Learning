package com.kodnest.LuckyNumber;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number:");
int num=scan.nextInt();
int square=num*num;
while(num>0)
{
	if((num%10)!=(square%10))
	{
		System.out.println("it is not Automorphic number");
		return;
	}
	num=num/10;
	square=square/10;
}
System.out.println("it is automorphic number");
	}

}
