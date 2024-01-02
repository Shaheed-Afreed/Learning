package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class Countingvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		count(str);
		
		
	}
		public static void count(String str)
		{
		int vow=0;
		int cons=0;
		int dig=0;
		int sc=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char c=str.charAt(i);
			if(Character.isLetter(c))
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					vow++;
				}
				else
				{
					cons++;
				}
			else if(Character.isDigit(c))
			{
				dig++;
			}
			else
			{
				sc++;
			}
		}
		System.out.println("vowels: "+vow);
		System.out.println("consonent: "+cons);
		System.out.println("digit: "+dig);
		System.out.println("special character: "+sc);

	}

}
