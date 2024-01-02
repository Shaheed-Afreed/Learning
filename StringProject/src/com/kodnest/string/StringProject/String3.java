package com.kodnest.string.StringProject;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String:");
		String str = scan.nextLine();

		String arr1[] = str.split(" ");
		String[] arr2 = new String[arr1.length];
		StringBuffer sb = new StringBuffer();
		int j = 0;
		for (int i = arr1.length-1; i >=0; i--) {
			arr2[j] = arr1[i];
			sb.append(arr2[j]+" ");
			j++;
		}
		
		str=new String(sb);
		System.out.println(str);

	}

}
