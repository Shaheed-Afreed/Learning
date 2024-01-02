package com.kodnest.Student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number of student");
int studentCount=scan.nextInt();
Student arr[]=new Student[studentCount];
//storing the elements
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("enter the rollno,name and age of student "+(i+1));
	arr[i]=new Student(scan.nextInt(),scan.next(),scan.nextInt());
}
//displaying the data
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i].rollno+" "+arr[i].name+" "+arr[i].age+" ||");
}

	}

}
