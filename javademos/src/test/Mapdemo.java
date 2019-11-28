
package test;

import java.util.*;

public class Mapdemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ram");
		hm.put(2, "Sita");
		System.out.println(hm);
		
		//duplicate values allowed
		hm.put(3, "Ram");
		System.out.println(hm);
		
		//Duplicate keys wont allow
		hm.put(3, "Sam");
		System.out.println(hm);
		
		//getting value based on key
		System.out.println(hm.get(2));
		
		//retrieving all keys
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		
		//retrieving all key, value pairs
		Set<Map.Entry<Integer, String>> kv = hm.entrySet();
		for(Map.Entry<Integer, String> k: kv)
         {
			System.out.println(k.getKey()+": "+ k.getValue());
		}
		
	}

}
