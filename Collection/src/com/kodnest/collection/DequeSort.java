package com.kodnest.collection;

import java.util.*;

public class DequeSort {

	public static void main(String[] args) {
ArrayDeque ad=new ArrayDeque();
ad.add(10);
ad.add(40);
ad.add(30);
ad.add(70);
ad.add(50);
System.out.println(ad);
ArrayList al=new ArrayList(ad);
//al.addAll(ad);
Collections.sort(al);
System.out.println(al);
	}

}
