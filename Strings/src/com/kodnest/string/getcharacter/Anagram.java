package com.kodnest.string.getcharacter;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str1=scan.nextLine().toLowerCase();
String str2=scan.nextLine().toLowerCase();
anagram(str1, str2);


	}
public static void anagram(String str1,String str2)
{
char arr1[]=str1.toCharArray();
char arr2[]=str2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
if(Arrays.equals(arr1, arr2))
{
	System.out.println("it is Anagram");
}
else
{
	System.out.println("it is not anagram");
}

	}

}
