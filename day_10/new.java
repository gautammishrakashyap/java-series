// (Very Easy) Write a program to print the sum of the first n even numbers using a while loop.
public class new {
    public static void main(String[] args) {
        int n = 5; // Number of even numbers to sum
        int count = 0; // Counter for even numbers
        int sum = 0; // Sum of even numbers
        int number = 2; // Starting from the first even number

        while (count < n) {
            sum += number; // Add the current even number to the sum
            number += 2; // Move to the next even number
            count++; // Increment the counter
        }

        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
    }
}
