package Threads;

public class Calc extends Thread{
	public int sum=0;
	public int total() {
		for(int i=1;i<100;i++) {
			sum+=i;
		}
		return sum;
		}
	
public void run() {
	synchronized(this){
		    total();
			this.notify();
		}
		
}
}
	


