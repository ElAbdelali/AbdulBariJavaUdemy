import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int factorial = 1;
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is " + factorial);

    }
}
