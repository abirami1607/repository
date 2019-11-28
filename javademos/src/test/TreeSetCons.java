package test;
import java.util.*;

import handson.MyComparator;

public class TreeSetCons {
	public static void main(String[] args) {
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Ram");
		ts1.add("Sita");
		ts1.add("Laksh");
		
		
		TreeSet<String> ts2=new TreeSet<String>(ts1);
		//sorts data in ascending order
		System.out.println(ts1);
		System.out.println(ts2);
		
		
		TreeSet<String> ts3=new TreeSet<String>(new MyComparator());
		ts3.add("keep");
		ts3.add("going");
		ts3.add("on");
		System.out.println(ts3);
	}

}
