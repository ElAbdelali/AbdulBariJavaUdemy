class Cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double totalSurfaceArea(){
        return 2 * lidArea() + circumference()*height;
    }
    public double volume(){
        return lidArea()*height;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.radius = 7.0;
        cylinder.height = 10.0;

        System.out.printf("%.2f%n", cylinder.lidArea());
        System.out.printf("%.2f%n", cylinder.circumference());
        System.out.printf("%.2f%n", cylinder.totalSurfaceArea());
        System.out.printf("%.2f", cylinder.volume());



    }


}
