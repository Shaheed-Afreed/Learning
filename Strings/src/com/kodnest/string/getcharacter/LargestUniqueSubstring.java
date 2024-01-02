package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class LargestUniqueSubstring {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.next();
String max="";
for(int i=0;i<=str.length()-1;i++)
{
	for(int j=i+1;j<=str.length();j++)
	{
		String temp=str.substring(i, j);
		
		boolean res=isUnique(temp);
		if(res==true)
		{
			if(temp.length()>max.length())
			{
				max=temp;
			}
		}
	}
}
System.out.println(max);

	}
public static boolean isUnique(String str)
{
	for(int i=0;i<=str.length()-1;i++)
	{
		for(int j=i+1;j<=str.length()-1;j++)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				return false;
			}
		}
	}
	return true;
}
	

}
