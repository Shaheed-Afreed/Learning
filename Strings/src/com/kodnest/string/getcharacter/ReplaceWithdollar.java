package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class ReplaceWithdollar {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
char arr1[]=str.toCharArray();
char arr2[]=new char[arr1.length];
for(int i=0;i<=arr1.length-1;i++)
{
	if(arr1[i]=='a'||arr1[i]=='e'||arr1[i]=='i'||arr1[i]=='o'||arr1[i]=='u') {
		arr2[i]='$';
	}else
	{
		arr2[i]=arr1[i];
	}
			
}
str=new String(arr2);
System.out.println(str);

	}

}
