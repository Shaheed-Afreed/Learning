package com.kodnest.recursion;

import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the two number");
int m=scan.nextInt();
int n=scan.nextInt();
Gcd div=new Gcd();
int res=div.gcd(m, n);
System.out.println(res);
	}

}
