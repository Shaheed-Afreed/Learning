package come.kodnest.array.rotateArray;
import java.util.Scanner;
public class RotateArray
{

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number of Rotation:");
			int n=scan.nextInt();
			System.out.println("enter the array length");
			int arr[]=new int[scan.nextInt()];
			System.out.println("enter the number:");
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=scan.nextInt();
			}
			
	for(int k=0;k<=n;k++)
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	System.out.println("array content are ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" |");
	}
		

	
		
	

		}
}
