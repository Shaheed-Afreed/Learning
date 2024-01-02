package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine().toUpperCase();
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
	char c=(char) (i+65);
	if(str.indexOf(c)>=0)
	{
		count++;
	}
}
if(count==26)
{
	System.out.println("it is panagram");
}else
{
System.out.println("it is not panagram");
}

	}

}
