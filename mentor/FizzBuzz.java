package mentor;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int num=scan.nextInt();
fizz(num);
	}
	public static void fizz(int num)
	{
		if(num%3==0 && num%5==0)
		{
			System.out.println("FizzBuzz");
		}
		
		else if(num%5==0)
		{
			
			System.out.println("Buzz");
		}
		else if(num%3==0)
		{
			System.out.println("Fizz");
		}
		else
		{
			System.out.println(num);
		}
			
		
	}

}
