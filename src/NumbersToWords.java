import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {

        // Display a number in words even with tailing 0

        // need to separate a num

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int numToBeReversed = num;
        int reverse = 0;
        int r;
        String str = "";

        while (numToBeReversed != 0){
            r = numToBeReversed % 10;
            numToBeReversed= numToBeReversed/10;
            str = (str + r);
        }

        for(int i = str.length()-1; i >= 0; i--){

            switch (str.charAt(i)) {
                case '0':
                    System.out.println("Zero");
                    break;
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                case '6':
                    System.out.println("Six");
                    break;
                case '7':
                    System.out.println("Seven");
                    break;
                case '8':
                    System.out.println("Eight");
                    break;
                case '9':
                    System.out.println("Nine");
                    break;
            }
        }
    }
}
