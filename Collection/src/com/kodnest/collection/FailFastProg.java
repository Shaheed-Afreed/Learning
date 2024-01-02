package com.kodnest.collection;

import java.util.ArrayList;

public class FailFastProg {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add(30);
int count=40;
for(Object x:al)
{
	System.out.println(x+" ");
	al.add(count);
	count+=10;
}
}
	}


