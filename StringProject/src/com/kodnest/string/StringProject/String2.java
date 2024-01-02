package com.kodnest.string.StringProject;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
String[] arr1=str.split(" ");
String reverse="";
for(int i=0;i<=arr1.length-1;i++)
{
	String word=arr1[i];
	char arr2[]=word.toCharArray();
	char arr3[]=new char[arr2.length];
	int j=arr3.length-1;
	for(int k=0;k<=arr2.length-1;k++)
	{
		arr3[j]=arr2[k];
		j--;
	}  
	String revword=new String(arr3);
	reverse=reverse+revword+" ";
}
System.out.println(reverse);

	}

}
