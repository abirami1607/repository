package handson;

import java.util.ArrayList;
import java.util.Iterator;

public class Basics {
	public static void main(String[] args) {
	
	int num1 = 10;
	Integer num2 =num1; //autoboxing
	//Integer num2 = Integer.valueOf(num1);
	System.out.println(num2);
	
	int num3=num2;//autounboxing
	//int num3 = num2.intValue();
	System.out.println(num3);
	
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("Hello");
	al.add(null);
	al.add(true);
	System.out.println(al);
		Iterator itr = al.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());

	
	
//	for(int i=0;i<al.size();i++){
//		
//		System.out.println(al.get(i));
//	}
//	
//	
	
	
	
	
	

}
}