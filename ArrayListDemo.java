package collections;

import java.util.ArrayList;
public class ArrayListDemo {
	

	public static void main(String[] args) {
		
       ArrayList a1= new ArrayList();
       
       System.out.println(a1);
       System.out.println(a1.size());
       
       a1.add(100);
       a1.add(200);
       
       System.out.println(a1);
       System.out.println(a1.size());
       
       a1.add("java");
       a1.add("python");
       System.out.println(a1);
       System.out.println(a1.size());
       
       a1.remove(0);
       System.out.println(a1);
       System.out.println(a1.size());
       
       a1.add(0,999);
       System.out.println(a1);
       System.out.println(a1.size());
       
       //Generic  version of Arraylist
       ArrayList<String> courses=new ArrayList<String>();
        courses.add("JFS");
        courses.add("PFS");
        courses.add("MEAN");
        courses.add("MERN");
        
        System.out.println(courses);
        
        System.out.println(courses.get(0));
        System.out.println(courses.get(1));
      //  System.out.println(courses.get(4));
        
        System.out.println("-----------------");
        
        //Traversal using for each loop
        
        for(String course:courses) {
        	
        	System.out.println(course);
        }
        
        
       
	}

}

/*
  1.arraylist is growable in nature
  2.duplicates are allowed
  3. maintained insertion order
  
 */
