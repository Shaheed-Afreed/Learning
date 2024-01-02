package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class ComparisionOfSubString {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
System.out.println("enter the number to sub");
int k=scan.nextInt();
System.out.println(compare(str, k));

	}
	public static String compare(String str,int k)
	{
	String smallest=str.substring(0,k);
	String largest=str.substring(0, k);
	for(int i=1;i<=str.length()-k;i++)
	{
		String Current=str.substring(i,i+k);
		
		
		if(Current.compareTo(smallest)<0)
		{
		smallest=Current;
		}
		 if(Current.compareTo(largest)>0)
		{
			largest=Current;
		}
	}
	return smallest+ "\n"+largest;
	}

}
