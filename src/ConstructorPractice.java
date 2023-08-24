class Rectanglee{
    private double length;
    private double breadth;

    public Rectanglee(){
        length = 1;
        breadth = 1;
    }
    public Rectanglee(double l, double b){
        length=l;
        breadth=b;
    }
    public Rectanglee(double side){
        length = breadth = side;
    }

}
public class ConstructorPractice {

    public static void main(String[] args) {
        Rectanglee r1 = new Rectanglee();
        Rectanglee r2 = new Rectanglee(2,4);
        Rectanglee r3 = new Rectanglee(2);
    }


}
