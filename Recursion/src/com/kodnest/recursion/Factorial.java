package com.kodnest.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int n=scan.nextInt();
Fact fact=new Fact();
int res=fact.fact(n);
System.out.println(res);
	}

}
