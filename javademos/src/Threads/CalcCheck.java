package Threads;

public class CalcCheck {
	public static void main(String[] args) throws InterruptedException {
		Calc c=new Calc();
		c.start();
		synchronized(c) {
			c.wait();
		}System.out.println(c.sum);
	}

}
