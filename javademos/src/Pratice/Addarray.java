package Pratice;

import java.util.ArrayList;

public class Addarray {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			al.add(i);
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

}
