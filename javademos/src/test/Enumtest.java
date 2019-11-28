package test;
import java.util.*;

public class Enumtest {
	public static void main(String[] args) {
		Stack<String> st1= new Stack<String>();
		st1.add("SEE");
		st1.add("YOU");
		st1.add("Move");
		st1.add("ON");
		System.out.println(st1);
		st1.add("ON");              //stack allows duplicate values
		System.out.println(st1);
		Enumeration e= st1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
