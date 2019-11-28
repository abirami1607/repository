package test;

import java.util.ListIterator;
import java.util.*;

public class Stackdemos {
	public static void main(String[] args) {
		Stack v1=new Stack();
		v1.push("din");
		v1.push(14);
		v1.add("sin");
		v1.push(45);
		System.out.println(v1);
		System.out.println("Capacity"+v1.capacity());
		System.out.println("size"+v1.size());
		System.out.println("empty"+v1.empty());
		System.out.println("LastIndexOf"+v1.lastIndexOf(45));
		System.out.println("removeelement"+v1.removeElement("sin"));
		System.out.print(v1);
		System.out.println("search"+v1.search(34));
		System.out.println("peek"+v1.peek());
		System.out.println("pop"+v1.pop());
		v1.push(432);
		//v1.setSize(20);
		System.out.println("capacity"+v1.capacity());
		System.out.println("size"+v1.size());
		
		
		


		//System.out.println();
		ListIterator<Integer> itr=v1.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		
		
	}

}}
