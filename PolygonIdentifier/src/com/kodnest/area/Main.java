package com.kodnest.area;

import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides)
	{
		switch(sides)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
			System.out.println("Triangle ");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("pentagon");
			break;
		case 6:
			System.out.println("hexagon ");
			break;
			
			default :
				System.out.println("polygon");
		}
			
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		identifyPolygon( sides);
		

	}

}
