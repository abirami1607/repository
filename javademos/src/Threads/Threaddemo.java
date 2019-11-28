package Threads;

public class Threaddemo extends Thread {
	public static void main(String[] args) throws InterruptedException {
		
		Cubes c1=new Cubes();
		Squares s1=new Squares();
		c1.start();
		s1.start();
		for(int j=0;j<1;j++) {
			System.out.println("value of j is"+j);
			Thread.sleep(10);
		}
}
	
}