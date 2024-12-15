// Write a program to find the factorial of a number using a for loop.
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no.");
        int num = sc.nextInt();

        long factorial = 1;

        for(int i=1; i<= num; i++){
            factorial *=i;


        }
        System.out.println(factorial);
        
        
    }
}