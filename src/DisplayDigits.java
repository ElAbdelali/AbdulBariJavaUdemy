import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int r;

        while(num != 0){
            r = num %10;
            num=num/10;
            System.out.println(r);

        }
    }
}
