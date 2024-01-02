package com.kodnest.Copyarray;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the array length");
int arr1[][]=new int[scan.nextInt()][scan.nextInt()];
System.out.println("enter the array element:");
for(int i=0;i<=arr1.length-1;i++)
{
	for(int j=0;j<=arr1[i].length-1;j++)
	{
		arr1[i][j]=scan.nextInt();
	}
}
int[][] arr2=new int [arr1.length][arr1.length];
System.out.println("enter the array2 element:");
for(int i=0;i<=arr2.length-1;i++)
{
	for(int j=0;j<=arr2[i].length-1;j++)
	{
		arr2[i][j]=scan.nextInt();
	}
}
int arr3[][]=new int[arr1.length][arr1.length];
System.out.println("sum of arrrays are..");
for(int i=0;i<=arr2.length-1;i++)
{
	for(int j=0;j<=arr2[i].length-1;j++)
	{
		arr3[i][j]=arr1[i][j]+arr2[i][j];
	}

	}
System.out.println("array 1 content are....");
for(int i=0;i<=arr1.length-1;i++)
{
	for(int j=0;j<=arr1[i].length-1;j++)
	{
	System.out.print(arr1[i][j]+" ");
	}
	System.out.println();
}
System.out.println("array 2 content are:");
for(int i=0;i<=arr2.length-1;i++)
{
	for(int j=0;j<=arr2[i].length-1;j++)
	{
		System.out.print(arr2[i][j]+" ");
	}
	System.out.println();
}
System.out.println("array 3 content are...");
for(int i=0;i<=arr2.length-1;i++)
{
	for(int j=0;j<=arr2[i].length-1;j++)
	{
				System.out.print(arr3[i][j]+" ");
	}
	System.out.println();

}
}
}