package Assignment3;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the id : ");
        int id = scanner.nextInt();
        scanner.nextLine();                             // Consume the leftover newline

        System.out.println("Enter the title : ");
        String title = scanner.nextLine();

        System.out.println("Enter the price : ");
        double price = scanner.nextDouble();
        scanner.nextLine();                             // Consume the leftover newline

        System.out.println("Enter the description : ");
        String description = scanner.nextLine();

        System.out.println("Enter the category : ");
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
