package Assignment12;
//print sum of odd numbers from m-n
import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, m, n, sum = 0;
		
		System.out.print("Enter the starting number: ");
		m = input.nextInt();
		
		System.out.print("Enter the ending number: ");
		n = input.nextInt();
		
		for (i = m; i<=n; i++) {
			if(i%2!=0) {
				sum = sum+i;
			}
		}
		System.out.println("The sum of odd number is: "+sum);
		input.close();
	}
}
