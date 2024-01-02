package com.kodnest.Array;

import java.util.Scanner;

public class Scenario3 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
float arr[]=new float[10];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("height of player "+i);
	arr[i]=scan.nextFloat();
}
System.out.println("array content are ");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+"|");
}
	}

}
