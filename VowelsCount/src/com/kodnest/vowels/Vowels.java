package com.kodnest.vowels;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the String");
String str=scan.nextLine();
int vow=0;
int cons=0;
int dig=0;
int sc=0;
for(int i=0;i<=str.length()-1;i++)
{
	char ch=str.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		vow++;
	}
	else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
	{
		dig++;
	}
	else if(ch==' '||ch==','||ch=='!')
	{
		sc++;
	}
	else
	{
		cons++;
	}
}
System.out.println(vow+" vowels ");
System.out.println(cons+" consonent ");
System.out.println(sc+" special character ");
System.out.println(dig+" digit  ");
	}

}
