package mentor;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the amount to calculate the tax");
double amount=scan.nextDouble();
if(amount>1 && amount<=10000)
{
	System.out.println(amount/100*5);
}
else if(amount>10001 &&amount<=20000)
{
	System.out.println(amount/100*10);
	
}
else if(amount>20001 && amount<=50000)
{
	System.out.println(amount/100*15);
}
else
{
	System.out.println(amount/100*20);
}
	}

}
