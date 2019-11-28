package Pratice;

import java.util.ArrayList;
import java.util.Iterator;



public class Helo {
	public static void main(String[] args) {
	
		int temp,out=0;
		ArrayList list = new ArrayList();
		for(int i=1;i<=100;i++)
		{
			list.add(i);
			System.out.print(i);
		}
		Iterator obj = list.iterator();  
		
		while(obj.hasNext())
		{
			temp = (int)obj.next();
			if(temp%2==0)
			{
				out+=temp;
				System.out.println(temp);
			}
			
		}
		System.out.println(out);
     	System.out.println(list);
     	
	}
}


