package com.kodnest.Inverse;

public class RotateApp {

	public void rotate(int n,int arr[]) {
		for(int k=1;k<=n;k++)
		{
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
		

	}

}
