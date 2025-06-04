package Assignment9;
/*
 *switch assignment: call center
 * if user select option 1 then set language Bengali.
 * if user select option 2 then set language Hindi.
 * if user select option 3 then set language Urdu.
 * for any other option set language English.
 */
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your option [1-3]:");
        int option = input.nextInt();

        switch(option){
            case 1:
                System.out.println("Selected language is Bengali.");
                break;
            case 2:
                System.out.println("Selected language is Hindi.");
                break;
            case 3:
                System.out.println("Selected language is Urdu.");
                break;
            default:
                System.out.println("Selected language is English.");
        }
        input.close();
    }
}
