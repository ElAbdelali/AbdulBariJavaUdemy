
class Testt{ // modifier static cannot be used on outer classes, only inner classes can be static
    static int x = 10;
    int y = 20;
    void show(){
        System.out.println(x+ " " + y); // a non static method is allowed to access a static member and non static members of the class
    }
    static void dsisplay(){
        System.out.println(x); // a static method is also allowed
        //System.out.println(x + " " + y); // not able to access the non static member of the class
    }

}
public class StaticPractice {
    public static void main(String[] args) {
        Testt t1 = new Testt();
        t1.x = 30; // this will change for both objects referencing the static member
        t1.y = 50; // this will not change the objects referemcomg the static member, only the t1 object will be changed
        t1.show();

        Testt t2 = new Testt();
        t2.show();

    }
}
