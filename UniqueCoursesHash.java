package collections;
import java.util.HashSet;

public class UniqueCoursesHash {
	
		    public static void main(String[] args) {
		        
		        HashSet<String> courses = new HashSet<>();
		        
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

