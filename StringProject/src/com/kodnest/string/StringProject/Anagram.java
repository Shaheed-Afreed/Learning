package com.kodnest.string.StringProject;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String str1=scan.nextLine();
	System.out.println("enter the anathor string");
	String str2=scan.nextLine();
	char arr1[]=str1.toLowerCase().toCharArray();
	char arr2[]=str2.toLowerCase().toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(Arrays.equals(arr1,arr2))
	{
		System.out.println("it is anagram");
	}
	else
	{
		System.out.println("it is not anagram");
	}

	}

}
