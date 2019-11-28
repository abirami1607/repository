package Threads;

public class MyThread extends Thread {
	Display d;
	String s;
	
	MyThread(Display ds, String s){
		this.d=ds;
		this.s=s;
		
	}
	public void run()
	{
		try {
			d.greet(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
