package com.kodnest.Array;

import java.util.Scanner;

public class Scenario1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<=arr.length-1;i++)
{
	 System.out.println("enter the marks of student "+i);
	 arr[i]=scan.nextInt();
	
	 
}
System.out.println("array content are ");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" |");
}
	}

}
