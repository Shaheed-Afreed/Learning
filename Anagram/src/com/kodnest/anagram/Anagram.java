package com.kodnest.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
char arr[]=str.toCharArray();
for(int i=0;i<=arr.length-1;i++)
{
	arr[0]= Character.toUpperCase(arr[0]);
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
System.out.println(str);

	}

}
