package com.kodnest.array.SelectionSort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the array length");
int arr[]=new int [scan.nextInt()];
System.out.println("enter the "+arr.length+" number");
for(int i=0;i<=arr.length-1;i++)
{
	arr[i]=scan.nextInt();
}
System.out.println("Before Sorting....");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println();

for(int i=0;i<=arr.length-2;i++)
{
	int min =arr[i];
	int pos=i;
	for(int j=i+1;j<=arr.length-1;j++)
	{
		if(arr[j]<min)
		{
		min=arr[j];
		pos=j;
		}
	}
	int temp=arr[i];
	arr[i]=arr[pos];
	arr[pos]=temp;
	
}
System.out.println("After swapping.....");
for(int i=0;i<=arr.length-1;i++)
{
	
		System.out.print(arr[i]+" ");
	}

	}

}
