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
public class Circle1{

    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle2 = new Circle();

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