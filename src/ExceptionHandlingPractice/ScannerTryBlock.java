package ExceptionHandlingPractice;
import java.util.Scanner;

public class ScannerTryBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a number: ");
        a = scan.nextInt();
        System.out.println("Enter a second number: ");
        b = scan.nextInt();

        try{
            int c = a/b;
            System.out.println("Your total is: " + c);
        }catch(ArithmeticException e){
            System.out.println("The Denominator should not be zero");
        }
        System.out.println("Thank you!");
    }
}
