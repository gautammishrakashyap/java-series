// Write a program to check whether a number is even or odd.
import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("enter the number ");
        int n = scanner.nextInt();

        if (n%2==0) {
            System.out.println("even");
            
        }
        else{
            System.out.println("odd");
        }
    }
    
}
