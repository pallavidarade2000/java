package collections;

import java.util.HashSet;

/*
 won't maintain any insertion order.
 element are stored based on their hashcode.
  duplicates values not allows.
 hash code: 
 
 jvm genrates a unique id to every object based
 on its address.that unique id is nothing but hashcode.
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(100);
		hs.add(500);
		hs.add(400);
		hs.add(200);
		hs.add(300);
		
		System.out.println(hs);
		
		System.out.println(hs.hashCode());
		
		String s1=new String ("java");
        String s2=new String ("python");
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        
		

	}

}
