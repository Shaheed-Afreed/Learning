package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String str=scan.nextLine();
System.out.println(str.replace(" ", "99"));
	}

}
