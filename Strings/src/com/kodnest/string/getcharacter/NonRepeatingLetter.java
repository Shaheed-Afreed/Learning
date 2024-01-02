package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class NonRepeatingLetter {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
	char c=str.charAt(i);
	if(str.indexOf(c)==str.lastIndexOf(c))
	{
		System.out.print(c);
		return;
	}
}

	}

}