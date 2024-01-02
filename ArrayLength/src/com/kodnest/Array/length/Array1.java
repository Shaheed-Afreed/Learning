package com.kodnest.Array.length;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the array1 length");
int arr1[]=new int[scan.nextInt()];
System.out.println("enter the "+arr1.length+" element");
for(int i=0;i<=arr1.length-1;i++)
{
	
	arr1[i]=scan.nextInt();
}
System.out.println("enter the array2 element ");
int arr2[]=new int[arr1.length];
for(int i=0;i<=arr2.length-1;i++)
{
	 arr2[i]=scan.nextInt();
}
int arr3[]=new int [arr1.length+arr2.length];

int i=0;
for(int j=0;j<=arr1.length-1;j++)
{
	arr3[i]=arr1[j];
	i++;
}
for(int j=0;j<=arr2.length-1;j++)
{
	arr3[i]=arr2[j];
	i++;
}
System.out.println("Array1 Content are ");
for(int j=0;j<=arr1.length-1;j++)
{
	System.out.print(arr1[j]+" ");
}
System.out.println();
System.out.println("Array 2 content are");
for(int j=0;j<=arr2.length-1;j++)
{
	System.out.print(arr2[j]+" ");
}
System.out.println();
System.out.println("Array3 content are  ");
for(int j=0;j<=arr3.length-1;j++)
{
	System.out.print(arr3[j]+" ");
}

 
	}

}
