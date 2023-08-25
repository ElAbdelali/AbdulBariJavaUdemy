class Circle{
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class CylinderInheritancePractice extends Circle{
    public double height;
    public double volume(){
        return area() * height;
    }
}
public class Circle1{

    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle2 = new Circle();
        CylinderInheritancePractice c = new CylinderInheritancePractice();
        c.radius = 7;
        c.height = 10;

        System.out.println("volume: " + c.volume());
        System.out.println("area: " + c.area());

        circle.radius = 14;
        circle2.radius = 15;
        System.out.printf("%.2f%n", circle.perimeter());
        System.out.printf("%.2f%n", circle.circumference());
        System.out.printf("%.2f%n", circle.area());

        System.out.printf("%.2f%n", circle2.perimeter());
        System.out.printf("%.2f%n", circle2.circumference());
        System.out.printf("%.2f%n", circle2.area());

    }

}