package com.kodnest.codeCheck;

public class KodnestSearchSort {	

	int linearSearch(int arr[],int key)

	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				return i;
				
			}
		}
		return -1;
	}

	int binarySearch(int arr[],int key)

	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("key  found at "+mid);
				return mid;
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

	return -1;

	}

	void bubbleSortAscending(int arr[])

	{
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
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

	void bubbleSortDescending(int arr[])

	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]<=arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

	void selectionSortAscending(int arr[])

	{
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
		for(int i=0;i<=arr.length-1;i++)
		{
			
				System.out.print(arr[i]+" ");
			}
		System.out.println();

	}

	void selectionSortDescending(int arr[])

	{

		
			for(int i=0;i<=arr.length-2;i++)
			{
				int min =arr[i];
				int pos=i;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[j]>min)
					{
					min=arr[j];
					pos=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
				
			}
			for(int i=0;i<=arr.length-1;i++)
			{
				
					System.out.print(arr[i]+" ");
				}
			System.out.println();

	
	}

	void insertionSortAscending(int arr[])

	{
		int item;
		int j;
		for(int i=1;i<=arr.length-1;i++)
		{
			item=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	void insertionSortDescending(int arr[])

	{
		int item;
		int j;
		for(int i=1;i<=arr.length-1;i++)
		{
			item=arr[i];
			j=i-1;
			while(j>=0&&arr[j]<item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	int findMinimumwithSorting(int arr[])

	{
		bubbleSortAscending(arr);
		int min=arr[0];


return min;

	}
	int findMinimumWithoutSorting(int arr[])
			{
		int min=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
		if(min>arr[i])
		{
			min=arr[i];
		}
		}
		return min; 
			}
	


	int findMaxWithSorting(int arr[])

	{
		bubbleSortAscending(arr);
		int max=arr[arr.length-1];
		

	return max;

	}
	int findMaxWithoutSorting(int arr[])
			{
		int max=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
			}

	}


