 package com.kodnest.Inverse;

import java.util.Scanner;

public class InverseRotate {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number of rotation:");
int n=scan.nextInt();
System.out.println("enter the array lengrh:");
int arr[]=new int[scan.nextInt()];
System.out.println("enter the element: ");
for(int i=0;i<=arr.length-1;i++)
{
	arr[i]=scan.nextInt();
}
new RotateApp().rotate(n, arr);
System.out.println("array content are ...");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" |");
}
	}

}
