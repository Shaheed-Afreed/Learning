package com.kodnest.recursion;

public class Gcd {
	public int gcd(int m,int n)
	{
		if(n==0)
		{
			return m;
		}else
		{
			return (gcd(n,m%n));
		}
	}

}
