// Write a program to check if a person is eligible to vote or not.
// A person is eligible to vote if their age is 18 or above.

import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter your age");
        int age = sc.nextInt();

        if(age<18){
            System.out.println("you can't vote chout");

        }
        else{
            System.out.println("sir please vote ");
        }



        
    }
}