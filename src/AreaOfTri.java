import java.util.Scanner;

public class AreaOfTri {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Welcome to calculating an area of a Triangle!");
        System.out.printf("%nPlease provide a base: ");
        float base = scan.nextFloat();
        System.out.printf("Please provide a height: ");
        float height = scan.nextFloat();
        float area = base * height * .5f;
        System.out.printf("The area of the triangle you provided is: %f", area);

    }
}
