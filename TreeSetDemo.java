package collections;

import java.util.TreeSet;

/*
 maintain ordered
 number are stored in ascending order
 string are stored in alphabetical order
  duplicates are not allowed.
  null value are not allowed.
 */

public class TreeSetDemo {

	public static void main(String[] args) {
		
TreeSet<Integer> hs=new TreeSet<Integer>();
		
		hs.add(100);
		hs.add(500);
		hs.add(400);
		hs.add(200);
		hs.add(300);
		
		System.out.println(hs);
		
		hs.add(100);
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);

	}

}
