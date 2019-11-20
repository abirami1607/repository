package test;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int a,b,t=0;
		Scanner j=new Scanner(System.in);
		a=j.nextInt();
		b=j.nextInt();
		System.out.println("variables before swaping"+a+" "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("variables before swaping"+a+" "+b);
		
		
	}

}
