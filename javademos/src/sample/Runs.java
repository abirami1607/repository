package sample;
import java.util.Scanner;

public class Runs 
{
	public static void main(String[] bc)
	{
		int n1,n2,n3,n4;
		double nr,percentage;
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the total runs:");
		n1=sc1.nextInt();
		System.out.print("Enter the no.of.fours:");	
		n2=sc1.nextInt();
		System.out.print("Enter the no.of.sixes:");
		n3=sc1.nextInt();
		n4=(4*n2)+(6*n3);
		System.out.println("total runs scored by the boundaries"+n4);
		nr=n1-n4;
		System.out.println("total runs scored by the running"+nr);
		percentage=((nr*100)/n1);
		System.out.println("percentage scored by the running"+String.format("%.2f",percentage));
	}

}
