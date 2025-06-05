package Assignment11;
//find factorial of n
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,i,fact=1;
		System.out.print("Enter a number: ");
		n = input.nextInt();
		
		for(i=1; i<=n; i++){
			fact = fact * i;
		}
		System.out.println("Factorial is: "+fact);
		input.close();
	}
}
