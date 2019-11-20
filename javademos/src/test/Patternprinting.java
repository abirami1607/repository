package test;
import java.util.Scanner;

public class Patternprinting {
	public static void main(String[] args)
	{
		int i,j,n=0;
		Scanner k=new Scanner(System.in);
		n=k.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
		{
				System.out.print("*");
		}
		   System.out.println(" ");	
		}
		
		
	}

}
