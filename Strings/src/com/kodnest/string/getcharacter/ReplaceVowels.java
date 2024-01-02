package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
StringBuffer sb=new StringBuffer();
for(int i=0;i<str.length()-1;i++)
{
	char c=str.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
	   str= str.replace(c, '$');
	}

	
	}
System.out.println(str);

}
}
