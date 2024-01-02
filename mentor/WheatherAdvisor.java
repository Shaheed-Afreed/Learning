package mentor;

import java.util.Scanner;

public class WheatherAdvisor {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the temperature");
int temp=scan.nextInt();
boolean isRaining=scan.nextBoolean();
if(temp<=10)
{
	if(isRaining==true)
	{
		System.out.println(" advise to bring coat");
	}
	else
	{
		System.out.println("no special advise");
	}
}
else if(temp>10 && temp<=20)
{
	if(isRaining==true)
	{
		System.out.println("it's raining, it's advised to bring an umbrella");
	}
	else
	{
		System.out.println("it's not raining, no special advice is needed.");
	}
}
else
{
	System.out.println("it's advised to wear light clothing");
}

	}

}
