package com.kodnest.recursion;

public class Binary {
	public int binarysearch(int key,int arr[],int low, int high)
	{
		if(low>high)
		{
			return -1;
		}
		int mid=low+(high-low)/2;
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
