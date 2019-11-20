package test;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int num,i;
		int t0=0, t1=1, t2;
		Scanner sh=new Scanner(System.in);
		num=sh.nextInt();
		System.out.print(t0+" "+t1+" ");
		
		for(i=0;i<num;i++)
		{
			t2=t0+t1;
			t0=t1;
			t1=t2;
			System.out.print(t2+" ");
		}
				
		
		
	}

}
