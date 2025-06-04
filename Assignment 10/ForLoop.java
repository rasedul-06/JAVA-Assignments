package Assignment10;
//find sum of 1-10 using for loop

public class ForLoop {
    public static void main(String[] args) {

        int i,sum=0;
        for( i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
    }
}
