package com.kodnest.ShadowingProblem;

public class mobile
{
	String brand;
	String color;
	int cost;
	
	
	
	public mobile(String brand,String color,int cost)
	{
	this.brand=brand;
	this.color=color;
	this.cost=cost;
	
	}
	
	

	public static void main(String[] args) {
	mobile m=new mobile("MI","blue",20000);
	System.out.println(m.brand+" "+m.color+" "+m.cost);

	}

}
