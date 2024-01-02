package com.kodnest.array.BubbleSort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the array length:");
int arr[]=new int [scan.nextInt()];
System.out.println("enter the "+arr.length+" number");
for(int i=0;i<=arr.length-1;i++)
{
	arr[i]=scan.nextInt();
}
System.out.println("before swapping...");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println();

for(int i=0;i<=arr.length-2;i++)
{
	for(int j=0;j<=arr.length-2-i;j++)
	{
		if(arr[j]>=arr[j+1])
		{
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		}
	}
}
System.out.println("After Swapping....");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
