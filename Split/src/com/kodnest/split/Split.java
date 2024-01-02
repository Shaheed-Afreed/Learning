package com.kodnest.split;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
String arr[]=str.split("[ !,?._'@]+");
for(int i=0;i<=arr.length-1;i++)
{
	String word=arr[i];
	System.out.println(word);
}
	}

}
