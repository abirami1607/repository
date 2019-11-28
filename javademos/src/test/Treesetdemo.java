package test;
import java.util.*;

public class Treesetdemo {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Abi");
		ts.add("DIN");
		ts.add("Ven");
		System.out.println(ts);
		ts.add("gif");
		ts.add("DIN");
		System.out.println(ts);
		Iterator itr= ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
