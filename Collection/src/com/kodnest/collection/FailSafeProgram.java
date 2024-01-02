package com.kodnest.collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeProgram {

	public static void main(String[] args) {
CopyOnWriteArrayList cwal=new CopyOnWriteArrayList();
cwal.add(10);
cwal.add(20);
cwal.add(30);
int count=40;
for(Object x:cwal)
{
	System.out.println(x+" ");
	cwal.add(count);
	count+=10;
}
System.out.println(cwal);
	}

}
