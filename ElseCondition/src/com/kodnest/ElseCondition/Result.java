package com.kodnest.ElseCondition;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your mark ");
		int mark=scan.nextInt();
		if(mark>=35)
		{
			System.out.println("pass ");
		}
		else
			System.out.println("fail ");

	}

}
