package com.kodnest.string.StringProject;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
	for(int j=i+1;j<=str.length();j++)
	{
		String output=str.substring(i, j);
		System.out.println(output);
	}
}
	}

}
