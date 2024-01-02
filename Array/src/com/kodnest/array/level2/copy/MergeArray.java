package com.kodnest.array.level2.copy;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the length of arr1");
int arr1[]=new int[scan.nextInt()];
for(int i=0;i<=arr1.length-1;i++)
{
	arr1[i]=scan.nextInt();
	
}
System.out.println("enter the lengthof array2");
int arr2[]=new int[arr1.length];
for(int i=0;i<=arr2.length-1;i++)
{
	arr2[i]=scan.nextInt();
}

int arr3[]=new int[arr2.length];
for(int i=0;i<=arr3.length-1;i++)
{
	arr3[i]=arr1[i]+arr2[i];
}

for(int i=0;i<=arr1.length-1;i++)
{
System.out.print(arr1[i]+" ");
}
System.out.println();

for(int i=0;i<=arr2.length-1;i++)
{
System.out.print(arr2[i]+" ");

}
System.out.println();
for(int i=0;i<=arr3.length-1;i++)
{
System.out.print(arr3[i]+" ");

}
	}
}
