import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to check if it is considered to be Armstrong or not");
        int armstrongOrNot = scan.nextInt();

        // first we have to separate the digits of the armstrong number
        // then we cube each number to see if the sum of the
        // cubed numbers are equal to the number
        int numToBeChecked = armstrongOrNot;
        int mod;
        int numCubed;
        int total = 0;

        while(numToBeChecked != 0){
            mod = numToBeChecked % 10;
            numToBeChecked = numToBeChecked/10;
            numCubed = mod*mod*mod;
            total = total + numCubed;


        }
        if (total == armstrongOrNot){
            System.out.println("Is a Armstrong Number");

        }else{
            System.out.println("Is not a Armstrong number");
        }

    }
}
