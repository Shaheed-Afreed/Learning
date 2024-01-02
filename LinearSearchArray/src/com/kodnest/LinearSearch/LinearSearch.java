package com.kodnest.LinearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the array length:");
int arr[]=new int[scan.nextInt()];
System.out.println("enter the elements of "+arr.length);
for(int i=0;i<=arr.length-1;i++)
{
	arr[i]=scan.nextInt();
}
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" |");
}
System.out.println();
System.out.println("enter the key element: ");
int key=scan.nextInt();
for(int i=0;i<=arr.length-1;i++)
{
	if(key==arr[i])
	{
		System.out.println("key found at "+i);
		return;
	}
}
System.out.println("key not found");

	}

}
