package Threads;

public class Syncdemo {
	public static void main(String[] args) {
		Display d=new Display();
		MyThread t1=new MyThread (d,"Abi");
	    MyThread t2=new MyThread (d,"bhavi");
	    MyThread t3=new MyThread (d,"sane");
	    MyThread t4=new MyThread (d,"jack");
	    
	    
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	}

}
