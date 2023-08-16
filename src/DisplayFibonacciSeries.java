import java.util.Scanner;

public class DisplayFibonacciSeries {
    public static void main(String[] args) {
        // fib(n) = fib(n-2) + f(n-1)

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the terms: ");
        int terms = scan.nextInt();
        int fibA = 0;
        int fibB = 1;
        int fibC;
        System.out.print(fibA + " " + fibB);
        for (int i = 0; i < terms-2; i++){
            fibC = fibA+fibB;
            System.out.print(" " + fibC);
            fibA = fibB;
            fibB = fibC;
        }
    }
}
