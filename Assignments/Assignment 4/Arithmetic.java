package Assignment4;
// Create a program to calculate installment amount for per month
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter phone price:");
        int price = input.nextInt();

        System.out.print("Enter the number of installment:");
        int installment = input.nextInt();

        int taka = price / installment;

        System.out.println("Amount pre month:"+taka);
    }
}
