package collections;
import java.util.ArrayList;

public class ArrayListSubject {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		
		  marks.add(44);
		  marks.add(55);
		  marks.add(66);
		  marks.add(77);
		  marks.add(88);
		  marks.add(99);
		  
		 
		  for(int subjectMarks:marks) {
	        	
	        	System.out.println(subjectMarks);
	        }
	        

	}
 
}
