package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class ReplacewithoutInbuilt {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
StringBuffer sb=new StringBuffer();
char arr[]=str.toCharArray();
for(int i=0;i<=arr.length-1;i++)
{
	if(arr[i]==' ')
	{
		sb.append(99);
	}
	else
	{
		sb.append(arr[i]);
	}
}
System.out.println(sb);

	}

}
