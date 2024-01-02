package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
System.out.println("enter the number ");
int num=scan.nextInt();
char arr[]=str.toCharArray();
for(int k=1;k<=num;k++)
{
char temp=arr[arr.length-1];
for(int i=arr.length-2;i>=0;i--)
{
	arr[i+1]=arr[i];
}
arr[0]=temp;
}
str=new String(arr);
System.out.println(str);
	}

}
