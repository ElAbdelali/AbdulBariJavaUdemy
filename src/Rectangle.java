class RectangleClass{
    private int length;
    private int breadth;

    public double area(){
        return getLength()*getBreadth();
    }

    public double perimeter(){
        return 2*getLength() + 2*getBreadth();
    }
    public boolean isSquare(){
        return getLength()==getBreadth();
    }
    public int getLength(){
        return length;
    }
    public void setLength(int l){
        length = l;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        breadth = b;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleClass rectangle = new RectangleClass();

        rectangle.setLength(2);;
        rectangle.setBreadth(4);

        System.out.printf("%.2f%n", rectangle.area());
        System.out.printf("%.2f%n", rectangle.perimeter());
        System.out.printf("%s", rectangle.isSquare());

    }
}
