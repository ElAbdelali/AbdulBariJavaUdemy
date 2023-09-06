abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}
class CircleCircle extends Shape{
    double radius;
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class RectangleRectangle extends Shape{
    double length;
    double width;
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length * width);
    }
}
public class AbstractShapeChallenge {
    public static void main(String[] args) {
        CircleCircle c = new CircleCircle();
        RectangleRectangle r = new RectangleRectangle();
        r.length = 10;
        r.width = 5;

        r.area();
        r.perimeter();

        c.radius = 12.3;
        System.out.printf("%.2f%n", c.area());
        System.out.printf("%.2f%n", c.perimeter());
        //below holds a reference of the object c
        Shape s = c;

        System.out.printf("%.2f%n%.2f%n", s.area(), s.perimeter());


    }
}
