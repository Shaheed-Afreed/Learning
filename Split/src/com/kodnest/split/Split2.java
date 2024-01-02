package com.kodnest.split;

import java.util.Scanner;

public class Split2 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
String arr[]=str.split("[ ,!?._'@]+ ");
System.out.println(arr.length);
for(String arr2:arr)
{
	System.out.println(arr2);
}
	}

}
