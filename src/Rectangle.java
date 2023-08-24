class RectangleClass{
    public int length;
    public int breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*length + 2*breadth;
    }
    public boolean isSquare(){
        return length==breadth;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleClass rectangle = new RectangleClass();

        rectangle.length=2;
        rectangle.breadth=4;

        System.out.printf("%.2f%n", rectangle.area());
        System.out.printf("%.2f%n", rectangle.perimeter());
        System.out.printf("%s", rectangle.isSquare());

    }
}
