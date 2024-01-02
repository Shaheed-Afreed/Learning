package mentor;

import java.util.Scanner;

public class AtmProgram {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int withDraw=scan.nextInt();
	int hundred=withDraw/100;
	withDraw=withDraw%100;
	int fifty=withDraw/50;
	withDraw=withDraw%50;
	int twenty=withDraw/20;
	withDraw=withDraw%20;
	int ten=withDraw/10;
	withDraw=withDraw%10;
	int five=withDraw/5;
	withDraw=withDraw%5;
	System.out.println(hundred+" hundred-dollar bills,"+fifty+" fifty-dollar bills, "+twenty+" twenty-dollar bills, "+ten+" ten-dollar bills, "+five+" five-dollar bills");
}
}


