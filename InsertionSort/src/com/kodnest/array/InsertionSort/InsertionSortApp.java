package com.kodnest.array.InsertionSort;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the array length:");
int arr[]=new int[scan.nextInt()];
System.out.println("enter the element:");
for(int i=0;i<=arr.length-1;i++)
{
	arr[i]=scan.nextInt();
}
System.out.println("before Sorting");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println();
new InsertionSort().Insert(arr);
System.out.println("after sorting....");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
