// Moderate) Write a program to calculate the factorial of a given number using a for loop.

// Input: A number from the user.
// Output: Print the factorial.
// Example: Input = 5 → Output = 120
public class fact {
    public static void main(String[] args) {
        int factt = 1;
        for (int index = 1; index <=5; index++) {
            factt= factt*index;
            
        }
        System.out.println(factt);

    }
    
}
