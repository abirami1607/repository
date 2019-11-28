package Pratice;
import java.util.*;

public class Maptest {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1,"Abi");
		hs.put(2,"bhaks");
		hs.put(3, "sumi");
		hs.put(4, "gif");
		hs.put(5,"Ramya");
		hs.put(6,"sundar");
		hs.put(7,"eswar");
		System.out.println(hs);
		Set <Map.Entry<Integer, String>> sh=hs.entrySet();
		for(Map.Entry<Integer, String> k:sh) {
			if(k.getKey()>2) {
				System.out.println(k);
			}
		}
		
		
	}

}
