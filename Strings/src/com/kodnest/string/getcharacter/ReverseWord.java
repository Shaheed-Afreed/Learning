package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();
        reverseString(str);
    }

    public static void reverseString(String str) {
    String arr []	=str.split(" ");
    String reverse="";
    for(int i=0;i<=arr.length-1;i++)
    {
    	String word=arr[i];
    	char arr2[]=word.toCharArray();
    	char arr3[]=new char[arr2.length];
    	int j=0;
    	for(int k=arr2.length-1;k>=0;k--)
    	{
    		arr3[j]=arr2[k];
    		j++;
    	}
    	str=new String(arr3);
    	reverse=reverse+str+" ";
    	
    }
    System.out.println(reverse);
    	
            }
}
