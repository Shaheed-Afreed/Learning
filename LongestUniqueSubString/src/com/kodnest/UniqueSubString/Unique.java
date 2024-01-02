package com.kodnest.UniqueSubString;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
subString(str);

	}
	public static void subString(String str)
	{
     String max="";
     for(int i=0;i<=str.length()-1;i++)
     {
    	 for(int j=i+1;j<=str.length();j++)
    	 {
    		 String subString=str.substring(i, j);
    		boolean res= isUnique(subString);
    		if(res==true)
    		{
    			if(subString.length()>max.length())
    			{
    				max=subString;
    			}
    		}
    	 }
    	 
     }
     System.out.println(max);
    	 
	}
	public static boolean isUnique(String str)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	}


