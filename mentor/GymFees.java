package mentor;

import java.util.Scanner;

public class GymFees {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the agee");
int age=scan.nextInt();
String membership=scan.nextLine();
if(age<18)
{
	System.out.println("30$/per month");
}
else if(age>=18 &&age<=65)
{
	String type=scan.next();
	if(type.equals("standard"))
	{
		System.out.println("50$ per month");
	}
	else
	{
		System.out.println("80$ per month");
	}
		
}
else
{
	System.out.println("40$ per month");
}
	}

}
