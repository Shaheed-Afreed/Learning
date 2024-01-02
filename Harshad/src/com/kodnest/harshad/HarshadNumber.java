package com.kodnest.harshad;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int num =scan.nextInt();
int original=num;
int sum=0;
while(num>0)
{
	int ld=num%10;
	sum=sum+ld;
	num=num/10;
}
if(original%sum==0)
{
	System.out.println(original+" is harshad");
	
}
else
{
	System.out.println(original+" is not harshad");
}
	}

}
