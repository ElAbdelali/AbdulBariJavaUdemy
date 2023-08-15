import java.util.Scanner;

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        int counter = 0;

        while (num != 0){
            num = num/10;
            counter++;
        }
        System.out.println(counter);
    }
}
