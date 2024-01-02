package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class CapitilizingFirstLetter {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
System.out.println(toUppercase(str));
	}
	public static String toUppercase(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[0]=Character.toUpperCase(arr[0]);
			if(arr[i]==' ')
			{
				int temp=arr[i+1];
				if(temp>=97 && temp<=122)
				{
					temp=temp-32;
				}
				arr[i+1]=(char) temp;
			}
		}
		str=new String(arr);
		return str;
	}

}
