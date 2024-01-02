package com.kodnest.string.StringProject;

import java.util.Scanner;

public class Substringcompare {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the String:");
String str=scan.nextLine();
System.out.println("enter the key:");
int key=scan.nextInt();
System.out.println(compareString(str, key));
	}
	public static String compareString(String str,int key)
	{
		String smallest=str.substring(0,key);
		String Largest=str.substring(0, key);
		for(int i=1;i<=str.length()-key;i++)
		{
			String currentString=str.substring(i,i+key);
			if(currentString.compareTo(smallest)<0)
			{
				smallest=currentString;
			}
			if(currentString.compareTo(Largest)>0)
			{
				Largest=currentString;
			}
		}
		return smallest+"\n"+Largest;
	}

}
