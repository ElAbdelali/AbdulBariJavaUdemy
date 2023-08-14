import java.util.Scanner;

public class FindRadix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        String input = scan.next();

        if (input.matches("^[01]+$")){
            System.out.println("It is a Binary Number");
        }
        else if(input.matches("^[0-7]+$")){
            System.out.println("It is a Octal Number");
        }
        else if(input.matches("^[0-9]+$")){
            System.out.println("It is a Decimal Number");
        }
        else if(input.matches("^[0-9A-F]+$")){
            System.out.println("It is a Hexadecimal Number");
        }
        else{
            System.out.println("NAM");
        }
    }
}
