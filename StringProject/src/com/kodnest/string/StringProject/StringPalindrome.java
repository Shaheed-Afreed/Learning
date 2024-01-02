package com.kodnest.string.StringProject;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
palindrome(str);

	}
	public static void palindrome(String str)
	{
		String original=str;
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			arr2[j]=arr1[i];
			j++;
		}
		String reverse=new String(arr2);
		if(original.equals(reverse))
		{
			System.out.println(original+" is palindrome");
		}
		else
		{
			System.out.println(original+" is not palindrome");
		}
	}

}
