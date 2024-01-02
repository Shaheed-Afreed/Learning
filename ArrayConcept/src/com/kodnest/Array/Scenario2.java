package com.kodnest.Array;

import java.util.Scanner;

public class Scenario2 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String arr[]=new String[6];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("enter the name of employee "+i);
	arr[i]=scan.next();
}
System.out.println("Array content are ");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" |");
		
}
	}

}
