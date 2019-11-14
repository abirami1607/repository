package test;
import java.util.Scanner;

public class Dice {
	
	public static void main(String[] ab) 
	{
		int num1,num2;
	Scanner sc1=new Scanner(System.in);
	num1=sc1.nextInt();
	num2=sc1.nextInt();
	if (num1==num2)
	{
		num1=num1+num2;
		System.out.println("The points scored is"+2*num1);
	}
		else if (num1>=0&&num1<=6 && num2>=0&&num2<=6)
		{
		num1=num1+num2;
	   System.out.println("The point scored is"+num1);
		
	}
		else
			{
			System.out.println("Invaild input");
			}
	
	}
}
