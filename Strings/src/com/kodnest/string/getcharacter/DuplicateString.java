package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
String str2="";
for(int i=0;i<=str.length()-1;i++)
{
	char c=str.charAt(i);
	if(str2.contains(String.valueOf(c))!=true)
	{
		str2=str2.concat(String.valueOf(c));
	}
		
}
System.out.println(str2);

	}

}
