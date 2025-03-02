// Write a program to swap two numbers without using a third variable.
import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 1st num");
        int a = scanner.nextInt();

        System.out.println("enter 2nd num");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b; 
        // change

        System.out.println("a is " +a+ " b is "+ b);


        
    }
    
}
