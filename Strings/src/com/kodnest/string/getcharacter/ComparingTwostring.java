package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class ComparingTwostring {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the String");
String str1=scan.nextLine().toLowerCase();
String str2=scan.nextLine().toLowerCase();
boolean res=compare(str1, str2);
if(res==true)
{
	System.out.println("Strings are equal");
}
else
{
	System.out.println("strings are not equal");
}
	}
	public static boolean compare(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		} 
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return false;
			}
		}
		return true;
			
	}

}
