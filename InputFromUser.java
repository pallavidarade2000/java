
package simpleProgram;
import java.util.Scanner;
public class InputFromUser {

	    public static void main(String[] args) {
	        
	        Scanner s1 = new Scanner(System.in);
	        
	        System.out.print("Input your first name: ");
	        String fname = s1.next();
	        
	        System.out.print("Input your last name: ");
	        String lname = s1.next();
	       
	        System.out.println("Hello \n" + fname + " " + lname);
	    }
	}



