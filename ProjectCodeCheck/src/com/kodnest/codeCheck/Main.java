package com.kodnest.codeCheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the array length:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the "+arr.length+" element:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Content are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		KodnestSearchSort kss=new KodnestSearchSort();
		while(true) {
		System.out.println("press 1  for searching....");
		System.out.println("press 2 for sorting....");
		System.out.println("press 3 for find minimum and maximuum.... ");
		System.out.println("enter your choice:");
		int num=scan.nextInt();
		switch (num)
		{
		case 1:
			System.out.println("press 1------> linear search & press2------>binary search");
			int choice=scan.nextInt();
			if(choice==1)
			{
				System.out.println("enter the key element:");
				int key=scan.nextInt();
				int res=kss.linearSearch(arr, key);
				if(res>=0)
				{
					System.out.println("key found at "+res);
				}
				else
				{
					System.out.println("key not found..");
				}
			
			}
			else if(choice==2)
			{
				System.out.println("enter the key element:");
				int key=scan.nextInt();
			int	res=kss.binarySearch(arr, key);
			if(res>=0)
			{
				System.out.println("key found at "+res);
			}else
			{
				System.out.println("key not found...");
			}
				
			}
			else
			{
				System.out.println("go to vasan eye care");
			}
				break;
				
		case 2:
			System.out.println("enter 1 for bubble Sort");
			System.out.println("enter 2 for selection sort....");
			System.out.println("enter 3 for insertion sort.....");
			int sorting=scan.nextInt();
			if(sorting==1)
			{
				System.out.println("enter the 1 for asscending bubble sort and 2 for descending bubble sort");
				int bubble=scan.nextInt();
				if(bubble==1)
				{
					kss.bubbleSortAscending(arr);	
				}
				else if(bubble==2)
				{
					kss.bubbleSortDescending(arr);
				}else
				{
					System.out.println("invalid...");
					return;
				}
			}
			else if(sorting==2)	
			{
				System.out.println("enter the 1 for asscending selection sort and 2 for descending selection sort");
				int select=scan.nextInt();
				if(select==1)
				{
					kss.selectionSortAscending(arr);	
				}
				else if(select==2)
				{
					kss.selectionSortDescending(arr);
				}else
				{
					System.out.println("invalid...");
					return;
				}
			}
			else if(sorting==3)	
			{
				System.out.println("enter the 1 for asscending insertion sort and 2 for descending insertion sort");
				int insert=scan.nextInt();
				if(insert==1)
				{
					kss.insertionSortAscending(arr);	
				}
				else if(insert==2)
				{
					kss.insertionSortDescending(arr);
				}else
				{
					System.out.println("invalid...");
					return;
				}
			}
			else
			{
				System.out.println("Go to vasan eye care....");
			}
			break;
		case 3:
			System.out.println("enter 1 for minimum ");
			System.out.println("enter 2 for maximum");
		int find=scan.nextInt();
		if(find==1)
		{
			System.out.println("enter 1 for find minimum with sort and 2 for find minimum without sort");
			int min=scan.nextInt();
			if(min==1)
			{
			int res=kss.findMinimumwithSorting(arr);
			System.out.println("minimum is "+res);
			
		}
		else if(min==2)
		{
			int res=kss.findMinimumWithoutSorting(arr);
			System.out.println("minimum is "+res);
		}
		else 
		{
			System.out.println("invalid...");
		}
			
		}
		else if(find==2)
		{
			System.out.println("enter 1 for find maximum with sort and 2 for find maximum without sort ");
			int max=scan.nextInt();
			if(max==1)
			{
				int res=kss.findMaxWithSorting(arr);
				System.out.println("maximum is "+res);
			}
			else if(max==2)
			{
				int res=kss.findMaxWithoutSorting(arr);
				System.out.println("maximum is "+res);
			}
			else 
			{
				System.out.println("go to vasan eye care....");
			}
			
		} 
		break;
		
		default: System.out.println("invalid...");
					
			}
				
				
		}			
			

	}

	
		
	}


