package Threads;

public class Runnabledemo  {
	public static void main(String[] args) {
		Cubes c=new Cubes();
		Thread t1=new Thread(c);
		
		Squares s=new Squares();
		Thread t2=new Thread(s);
		t1.setPriority(3);
		t2.setPriority(6);
		t1.start();
		t2.start();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	
	}
	
	
}
