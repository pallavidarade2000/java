package simpleProgram;

import java.util.Scanner; 

public class SumOfSeries { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter a number (n): "); 
        int n = scanner.nextInt(); 
         
        int sum = 0; 
         
        
        for (int i = 1; i <= n; i++) { 
            sum += i; 
        } 
         
        System.out.println("Sum = " + sum); 
         
        scanner.close(); 
    } 
} 