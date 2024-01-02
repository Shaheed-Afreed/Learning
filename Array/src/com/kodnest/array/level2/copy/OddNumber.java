package com.kodnest.array.level2.copy;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number ");
int arr[]=new int[scan.nextInt()];
for(int i=0;i<=arr.length-1;i++)
{
	arr[i]=scan.nextInt();
}
System.out.println("Odd numbers are: ");
for(int i =0;i<=arr.length-1;i++)
{
	if((arr[i]%2)!=0)
	{
		System.out.print(arr[i]+" ");
	}
}
	}

}
