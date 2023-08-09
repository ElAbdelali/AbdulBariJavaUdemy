import java.util.Scanner;

public class AreaOfTri2 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.printf("Today we'll calculate the area of the triangle with the length of the sides you provide!");
    System.out.printf("%nPlease enter the length of the first side: ");
    float side1 = scan.nextFloat();
    System.out.printf("Please enter the length of the second side: ");
    float side2 = scan.nextFloat();
    System.out.printf("Please enter the length of the third side: ");
    float side3 = scan.nextFloat();

    float sides = .5f * (side1 + side2 + side3);
    float area = (float) Math.sqrt(sides*(sides-side1)*(sides-side2)*(sides-side3));

    System.out.printf("The area is: %f", area);


    }
}
