package handson;
import java.util.*;

public class Vectorcc
{
	public static void main(String[] args) {
	Vector<String> v1= new Vector<String>();
	v1.add("Ram");
	v1.add("Sam");
	v1.add("Ravi");
	//vector maintains insertion order
	System.out.println(v1);
	//vector allows duplicates
	v1.add("Ravi");
	System.out.println(v1);
	
	System.out.println(v1.capacity());
	System.out.println(v1.contains("Ravi"));
	System.out.println(v1.elementAt(2));
	System.out.println(v1.get(1));
	//System.out.println(v1.elementAt(5));
	System.out.println("firstElement: " + v1.firstElement());
	
	Vector<String>v3 = (Vector<String>) v1.clone();
	System.out.println("v1: "+v1);
	System.out.println("v3: "+v3);
	v3.add("hgvd");
	System.out.println("v1: "+v1);
	System.out.println("v3: "+v3);
	v1.add("sumi");
	System.out.println("v1: "+v1);
	System.out.println("v3: "+v3);
	
	Vector<String> v2=new Vector<String>();
	v2.add("Abi");
	v1.add("bhava");
	v1.add("ric");
	v1.add("din");
	v1.addAll(v2);
	System.out.println(v1);
	v1.retainAll(v2);
	System.out.println(v1);
	v1.removeAll(v2);
	System.out.println(v1);
	v1.retainAll(v2);
	System.out.println(v1);
	
	
	
	

}}
