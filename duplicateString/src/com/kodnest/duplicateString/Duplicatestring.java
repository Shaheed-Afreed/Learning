package com.kodnest.duplicateString;

import java.util.Scanner;

public class Duplicatestring {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the String");
String str1=scan.nextLine();
String str2=new String();
for(int i=0;i<=str1.length()-1;i++)
{
	char c=str1.charAt(i);
	if(str2.contains(String.valueOf(c))!=true)
	{
		str2=str2.concat(String.valueOf(c));
	}
}
System.out.println(str2);
	}

}
