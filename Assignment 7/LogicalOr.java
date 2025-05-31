package Assignment7;
// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover
import java.util.Scanner;
public class LogicalOr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you love JAVA? [Y/N]: ");
        char ch = input.next().charAt(0);

        if(ch=='y' || ch=='Y'){
            System.out.print("You are a Java lover.");
        }else if(ch=='n' || ch=='N'){
            System.out.println("You are not a Java lover.");
        }else{
            System.out.println("Please enter a valid answer.");
        }
        input.close();
    }
}
