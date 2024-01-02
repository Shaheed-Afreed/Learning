package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
reverse(str);

	}
	public static void reverse(String str)
	{
		StringBuffer sb=new StringBuffer();
		String arr1[]=str.split(" ");
		for(int i=arr1.length-1;i>=0;i--)
		{
			sb.append(arr1[i]+" ");
		}
		System.out.println(sb);
	}

}
