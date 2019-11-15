package test;
import java.util.Scanner;
public class Friend 
{
	public static void main(String[] args)
	{
	double deposit,temp=0;
	int rate,threshold;
	Scanner sc1=new Scanner(System.in);
	System.out.print("Enter the deposit amount:");
	deposit=sc1.nextDouble();
	System.out.print("Enter the rate of interest:");
	rate=sc1.nextInt();
	System.out.print("Enter the threshold value:");
	threshold=sc1.nextInt();
	int count=0;
	while(deposit<threshold)
	{
		temp=((deposit/100)*rate);
		deposit=deposit+temp;
				count++;
	}
	System.out.print("number of years:"+count);
	
	
		
	}
	

}
