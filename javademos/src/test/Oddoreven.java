package test;
import java.util.Scanner;

public class Oddoreven {
	public static void main (String[] args) {
		int n;
		Scanner sh=new Scanner(System.in);
		n=sh.nextInt();
		if(n%22==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
