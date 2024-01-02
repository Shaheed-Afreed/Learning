package com.kodnest.Scanner;

import java.util.Scanner;

public class KeaBoardValue {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a integer value");
int a=scan.nextInt();
System.out.println("integer value is "+a);
System.out.println("Enter the real number ");
float b=scan.nextFloat();
System.out.println("real number is "+b);
System.out.println("Enter the anothor real number ");
double c=scan.nextDouble();
System.out.println("real number is "+c);
System.out.println("Enter the character");
char d=scan.next().charAt(0);
System.out.println("Character is "+d);
scan.nextLine();
System.out.println("Enter the name ");
String name=scan.next();
System.out.println("your name is "+name);


	}

}
