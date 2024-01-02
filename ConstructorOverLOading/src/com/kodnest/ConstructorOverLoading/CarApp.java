package com.kodnest.ConstructorOverLoading;

public class CarApp {

	public static void main(String[] args) {
		Car c1=new Car("Ritz","white",600000);
		System.out.println(c1.brand+" "+c1.color+" "+c1.cost);
		Car c2=new Car();
		System.out.println(c2.brand+" "+c2.color+" "+c2.cost);
		Car c3=new Car(60000);
		System.out.println(c3.brand+" "+c3.color+" "+c3.cost);
		Car c4=new Car("Swift");
		System.out.println(c4.brand+" "+c4.color+" "+c4.cost);
		
 

	}

}
