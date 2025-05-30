package Assignment3;
/*
 * create a main method
 * declare variables: id, title, price, description, category
 * get user input for each variables
 * print the variables
 */
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the id : ");
        int id = scanner.nextInt();
        scanner.nextLine();                             // Consume the leftover newline

        System.out.print("Enter the title : ");
        String title = scanner.nextLine();

        System.out.print("Enter the price : ");
        double price = scanner.nextDouble();
        scanner.nextLine();                             // Consume the leftover newline

        System.out.print("Enter the description : ");
        String description = scanner.nextLine();

        System.out.print("Enter the category : ");
        String category = scanner.nextLine();

        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);

        scanner.close();                                   // Close the scanner
    }
}
