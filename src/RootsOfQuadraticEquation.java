import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        double r1, r2;

        System.out.println("Please enter 3 integers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        r1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);

        System.out.println("The roots of the Quadratic formula are r1: " + r1 + " r2: " + r2);

    }
}
