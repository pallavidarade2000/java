package collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> courses = new TreeSet<String>();
		
		courses.add("Full stack  developer");
        courses.add("software Testing");
        courses.add("AWS");
        courses.add("Networking");
        courses.add("Cyber Security");

       
        System.out.println("Unique Courses:");
        for (String course : courses) {
            System.out.println(course);

	}
	}
}
