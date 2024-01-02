package com.kodnest.string.StringProject;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
String[] arr1=str.split(" ");
String reverse="";
for(int i=0;i<=arr1.length-1;i++)
{
	String word=arr1[i];
	char arr3[]=word.toCharArray();
	char []arr2=new char[arr3.length];
	int j=arr2.length-1;
	for(int k=0;k<=arr3.length-1;k++)
	{
		if(i%2!=0)
		{
		arr2[j]=arr3[k];
		j--;
		}else
		{
		arr2[j]	=arr3[j];
		j--;
		}
	}
	
	String revword=new String(arr2);
	reverse=reverse+revword+" ";
	
	
	
}
System.out.println(reverse);


	}

}
