package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class PrintingInStringPool {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String str=scan.next();
StringBuffer sb=new StringBuffer();
char arr[]=str.toCharArray();
for(int i=0;i<=arr.length-1;i++)
{
	sb.append(arr[i]);
}
System.out.println(sb);

	}

}
