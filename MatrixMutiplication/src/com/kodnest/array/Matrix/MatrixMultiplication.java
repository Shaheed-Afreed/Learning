package com.kodnest.array.Matrix;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the array1 length:");
int m=scan.nextInt();
int n=scan.nextInt();
int arr1[][]=new int[m][n];
System.out.println("enter the 1st array  elements");
for(int i=0;i<=arr1.length-1;i++)
{
	for(int j=0;j<=arr1[i].length-1;j++)
	{
		arr1[i][j]=scan.nextInt();
	}
}
System.out.println("enter the array2 length....");
int arr2[][]=new int [m][n];
System.out.println("enter the 2 nd array element");
for(int i=0;i<=arr2.length-1;i++)
{
	for(int j=0;j<=arr2[i].length-1;j++)
	{
		arr2[i][j]=scan.nextInt();
	}
}
int arr3[][]=new int [m][n];
for(int i=0;i<=arr3.length-1;i++)
{
	for(int j=0;j<=arr3[i].length-1;j++)
	{
		for(int k=0;k<=arr3[i].length-1;k++)
		{
			
				arr3[i][j]=arr3[i][j]+(arr1[i][k]*arr2[k][j]);
			
		}
	}

	}
System.out.println("array 1content are.....");
for(int i=0;i<=arr1.length-1;i++)
{
	for(int j=0;j<=arr1[i].length-1;j++)
	{
		System.out.print(arr1[i][j]+" ");
	}
	System.out.println();

	}
System.out.println();
System.out.println("array2 content are...");
for(int i=0;i<=arr2.length-1;i++)
{
	for(int j=0;j<=arr2[i].length-1;j++)
	{
		System.out.print(arr2[i][j]+" ");
	}
	System.out.println();

	}
System.out.println();
System.out.println("multiplication matrix are....");
for(int i=0;i<=arr3.length-1;i++)
{
	for(int j=0;j<=arr3[i].length-1;j++)
	{
		System.out.print(arr3[i][j]+" ");
	}
	System.out.println();

	}

}
}