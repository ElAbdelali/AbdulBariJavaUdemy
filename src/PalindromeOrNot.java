import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numToBeReversed = scan.nextInt();
        int palindromeOrNot = numToBeReversed;

        int r;
        int reverse = 0;

        while (numToBeReversed != 0){
            r = numToBeReversed % 10;
            numToBeReversed= numToBeReversed/10;
            reverse = reverse * 10 + r;
        }

        if(reverse == palindromeOrNot) {
            System.out.println("Number is a Palindrome");
        }else{
            System.out.println("Number is not a palindrome");
        }
    }
}
