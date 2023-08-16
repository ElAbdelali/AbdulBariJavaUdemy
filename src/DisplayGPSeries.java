import java.util.Scanner;

public class DisplayGPSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a starting number: ");
        int start = scan.nextInt();

        System.out.println("Enter the increment: ");
        int increment = scan.nextInt();

        System.out.println("Enter the number of times you'd like to iterate: ");
        int iteration = scan.nextInt();
        int term = start;
        for(int i = 0; i < iteration; i++){

            System.out.print(term + " ");
            term = term * increment;

        }
    }
}
