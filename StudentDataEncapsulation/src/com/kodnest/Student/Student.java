package com.kodnest.Student;

public class Student {
private int rollno;
private String name;
private int age;
//public setter method
public void setdata(int rollno,String name,int age)
{
	this.rollno=rollno;
	this.name=name;
	this.age=age;
}

//public getter method
public int getRollno()
{
	return rollno;
}
public String getname()
{
	return name;
}
public int  getage()
{
	return age;
}

}
