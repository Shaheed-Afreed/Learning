package com.kodnest.Method;

public class method {

	public static void main(String[] args) {
		greet();
		System.out.println(add());
		int a=10;
		int b=4;
		sub(a,b);
		System.out.println("Multiplication result is "+mul(a,b));
		
		

	}public static void greet()
	{
		System.out.println("Hello world...");
	}
	public static int add()
	{
		int a=10;
		int b=5;
		int c=a+b;
		return c;
	}
public static void sub(int a,int b)
{
	int sub=a-b;
	System.out.println("Subtraction result is "+sub);
}
public static int mul(int a,int b)
{
	return a*b;
}
}
