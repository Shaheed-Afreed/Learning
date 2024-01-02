package com.kodnest.array.level2.copy;

import java.util.Scanner;

public class DivideBy5 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int arr[]=new int[scan.nextInt()];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("enter the element:");
	arr[i]=scan.nextInt();
	
}
System.out.println("divisible by 5 are ");
for(int i=0;i<=arr.length-1;i++)
{
	if(arr[i]%5==0)
	{
		System.out.print(arr[i]+" ");
	}
}
	}

}
