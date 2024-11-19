package collections;

import java.util.HashMap;

/*
 1.to store key and value pairs
 2.maintain order based on hash code of key
 3. Duplicate keys are not allowed
 4.Duplicate values are allowed.
 
 */

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put("JFS", 250);
		hm.put("PFS", 220);
		hm.put("MEAN", 150);
		hm.put("MERN", 150);
		System.out.println(hm);
		hm.put("JFS", 300);
		System.out.println(hm);
		
	}

}
