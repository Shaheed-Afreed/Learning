package com.kodnest.recursion;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter the element");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("enter the key element");
		int key = scan.nextInt();
		BinarySearch b = new BinarySearch();
		int res = b.binarysearch(key, arr, 0, arr.length - 1);
		if (res != -1) {
			System.out.println("key found at " + res);
		} else {
			System.out.println("key not found");
		}
	}
	public int binarysearch(int key,int arr[],int low, int high)
	{
		if(low>high)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]==key)
		{
			return mid;
		}else if(key>arr[mid])
		{
			return binarysearch(key, arr, mid+1, high);
		}else 
		{
			return binarysearch(key, arr, low, mid-1);
		}
	}

}
