package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
char arr1[]=str.toCharArray();
int count=0;
for(int i=0;i<=arr1.length-1;i++)
{
	if((arr1[i]>='a'&&arr1[i]<='z')||(arr1[i]>='A'&&arr1[i]<='Z'))
	{
	char letter=arr1[i];
	count++;
	}
}
System.out.println(count);
	}

}
