package com.kodnest.string.StringProject;

public class StringCompare {
	public static void main(String[] args) {
		String s1="vikram";
		String s2="vedha";
		String s3="vikram"+"vedha";
		String s4="vikram"+"vedha";
		if(s3==s4)
		{
			System.out.println("reference are equal");
		}
		else
		{
			System.out.println("refernce are not equal");
		}
		
		String s5=s1+s2;
		String s6=s1+s2;
		if(s5==s6)
		{
			System.out.println("reference are equal");
		}
		else
		{
			System.out.println("refernce are not equal");
		}
		if(s5.equals(s6))
			if(s3==s4)
			{
				System.out.println("content  are equal");
			}
			else
			{
				System.out.println("content are not equal");
			}
		
		
	}

}
