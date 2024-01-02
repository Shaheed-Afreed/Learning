package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class LargestString {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
String arr[]=str.split(" ");
String max="";
for(int i=0;i<=arr.length-1;i++)
{
	String word=arr[i];
	if(word.length()>max.length())
	{
		max=word;
	}
}
System.out.println(max);
	}

}
