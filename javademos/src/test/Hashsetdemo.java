package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashsetdemo {
	public static void main(String[] args) {
		HashSet<String>hs= new HashSet<String>();
		hs.add("Sam");
		hs.add("Hello");
		hs.add("Ravi");
		//insertion order wont maintain
		System.out.println(hs);
		
		
		//duplicate wont allow
		//index value cant be accessed since they wont follow insertion order
		hs.add("Ravi");
		System.out.println(hs);
		System.out.println(hs.size());
		HashSet ho=hs;
		System.out.println(hs.equals(ho));
		Object[] str=hs.toArray();//to convert hashset to array
		//String[] str=(String[])hs.toArray();
		System.out.println(str[0]);
		System.out.println("Array:"+str[1]);
		str[1]="123";
		for(Object s: str) {
			System.out.println(s);
	}
		System.out.println(str[1]);
		System.out.println(hs.hashCode());
		System.out.println(ho.hashCode());
		System.out.println(hs.toString());
		//
		Iterator itr=hs.iterator();
		while(itr.hasNext())
	
	{
		System.out.println(itr.next());
	}
		
}}