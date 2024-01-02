package com.kodnest.array.binary;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the array length");
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
System.out.println("enter the key element:");
int key=scan.nextInt();

System.out.println();
int low=0;
int high=arr.length-1;
while(low<=high)
{
	int mid=(low+high)/2;
	if(key==arr[mid])
	{
		System.out.println("key  found at "+mid);
		return;
	}
	else if(key>arr[mid])
	{
		low=mid+1;
	}
	else
	{
		high=mid-1;
	}
	
	
}

System.out.println("key not found ");




	}

}
