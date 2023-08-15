import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numToBeReversed = scan.nextInt();

        int r;
        int reverse = 0;

        while (numToBeReversed != 0){
           r = numToBeReversed % 10;
           numToBeReversed= numToBeReversed/10;
           reverse = reverse * 10 + r;
        }
        System.out.println(reverse);
    }
}
