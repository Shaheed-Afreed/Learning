package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
boolean res=palindrome(str);
if(res==true)
{
	System.out.println("it is palindrome");
}else
{
	System.out.println("it is not palindrome");
}

	}
	public static boolean palindrome(String str)
	{
		String orginal=str;
		char arr[]=str.toCharArray();
		char arr2[]=new char[arr.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[j]=arr[i];
			j--;
		}
		String str2=new String(arr2);
		if(orginal.equals(str2))
		{
			return true;
		}
		return false;
	}

}
