import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height, length, breadth;

        System.out.println("Please enter the dimensions of the cube: ");
        height = scan.nextInt();
        length = scan.nextInt();
        breadth = scan.nextInt();

        int totalVolume = (height * length * breadth);
        int totalArea = 2 * (length * breadth + length * height + breadth * height);

        System.out.printf("Total Volume: %d Total Area: %d ", totalVolume, totalArea);




    }
}
