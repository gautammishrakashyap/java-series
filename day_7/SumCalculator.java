import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int num = 1; // Start from 1
        int sum = 0; // Initialize sum to 0

        // Use a while loop to calculate the sum
        while (num <= n) {
            sum += num; // Add the current number to sum
            num++;      // Increment the number
        }

        // Print the result
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        
        scanner.close(); // Close the scanner
    }
}
