package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
char arr[]=str.toCharArray();
char arr1[]=new char[arr.length];
int j=0;
for(int i=arr.length-1;i>=0;i--)
{
	arr1[j]=arr[i];
	j++;
}
str=new String(arr1);
System.out.println(str);
	}

}
