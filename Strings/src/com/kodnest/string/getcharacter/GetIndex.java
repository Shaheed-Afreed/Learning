package com.kodnest.string.getcharacter;

import java.util.Scanner;

public class GetIndex {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String str=scan.next();
System.out.println(str.indexOf(scan.next().charAt(0)));
	}

}
