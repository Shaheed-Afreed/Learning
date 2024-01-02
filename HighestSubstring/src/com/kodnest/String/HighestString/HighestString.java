package com.kodnest.String.HighestString;

import java.util.Scanner;

public class HighestString {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the String");
String str=scan.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
	for(int j=i+1;j<=str.length();j++)
	{
		System.out.println(str.substring(i,j));
	}
}
	}

}
