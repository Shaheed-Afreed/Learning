package com.kodnest.CartessionQuadrant;

import java.util.Scanner;

public class CartessionQuadrant {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the value of x ");
int x=scan.nextInt();
System.out.println("enter the value of y");
int y=scan.nextInt();
if(x>0&&y>0)
{
	System.out.println("Quadrant 1");
}
else if(x<0&&y>0)
{
	System.out.println("quadrant 2");
}
else if(x<0&&y>0)
{
	System.out.println("quadrant 3");
}
else if(x>0&&y<0)
{
	System.out.println("quadrant4");
}
else if(x==0 && y!=0)
{
	System.out.println("y axis ");
}
else if(x!=0 && y==0)
{
	System.out.println("x axis");
}
else
{
	System.out.println("Origin");
}

	}

}
