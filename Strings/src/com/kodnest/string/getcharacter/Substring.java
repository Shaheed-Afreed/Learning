package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enterr the string");
String str=scan.nextLine();

System.out.println(subString(str));
withoutInbuilt(str);

	}
public static String subString(String str)
{
	StringBuffer sb=new StringBuffer();
	
for(int i=0;i<=str.length()-1;i++)
{
	for(int j=i+1;j<=str.length();j++)
	{
		sb.append(str.substring(i,j)+"\n");
		
	}
}
return sb.toString();

	}
public static void withoutInbuilt(String str)
{
	for(int i=0;i<=str.length()-1;i++)
	{
		String str1="";
		for(int j=i;j<=str.length()-1;j++)
		{
			str1=str1+str.charAt(j);
			System.out.println(str1);
		}
	}
	
}

}
