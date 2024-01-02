package com.kodnest.ConstructorOverLoading;

public class Car {
	
String brand;
String color;
int cost;


public Car(String a,String b,int c)
{
	brand=a;
	color=b;
	cost=c;
}
public Car()
{
	brand="Swift";
	color="black";
	cost=400000;
}
public Car(int c)
{
	cost=c;
   brand="Rolls royce";
   color="gold";
   
}
public Car(String a)
{
	brand=a;
	color="gray";
	cost=5000000;
}


	}


