package greatestof3Number;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the 3 numbers to compare:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("greatest number is "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("greatest number is "+num2);
		}
		else
		{
			System.out.println("greatest number is "+num3);
		}
		{
			
		}
	}

}
