import java.util.Scanner;

public class MethodPractice {

    static int returnMax(int x, int y){
        if (x < y){
            return y;
        }else{
            return x;
        }
    }
    static void incrementBy1(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // value of z will not change event after the method is carried out
        int z = 10;
        incrementBy1(z);

        System.out.println(z);
        System.out.println("Enter two numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(returnMax(x,y));

    }
}
