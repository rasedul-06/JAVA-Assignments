package Assignment8;
// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n
// Step 2: Ask the candidate are you fluent in English? y/n
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: if else print sorry. You are not eligible to for the job interview.

import java.util.Scanner;

public class LogicalAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Have you completed your masters?[Y/N]: ");
        char ch1 = input.next().charAt(0);

        System.out.print("Are you fluent in English?[Y/N]: ");
        char ch2 = input.next().charAt(0);

        if(ch1=='Y' && ch2=='Y'){
            System.out.println("You are eligible for the job interview.");
        }else{
            System.out.println("You are not eligible for the job interview.");
        }
        input.close();
    }
}
