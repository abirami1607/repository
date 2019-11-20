package test;
import java.util.Scanner;

public class leapyear {
	public static void main(String args[]) {
		int year;
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if((year%400==0)||(year%4==0&&year%100!=0)) {
			System.out.println("leapyear");
		}
		else
		{
			System.out.println("Not a Leapyear");
		}
		
	}

}
