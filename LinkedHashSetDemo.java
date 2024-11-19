package collections;
import java.util.LinkedHashSet;


/*
 maintain orderd .
 */
public class LinkedHashSetDemo {

		
			    public static void main(String[] args) {
			        
			        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
			        
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
