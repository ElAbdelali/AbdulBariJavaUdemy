// difference between

class Outerrrr{
    static int x = 10;
    int y = 20;

    static class Inner{
        void display(){
            System.out.println(x);
            // System.out.println(y); cannot access non static members
        }
    }
    // this is how to access non static members

}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outerrrr.Inner i = new Outerrrr.Inner();
        Outerrrr o = new Outerrrr();
        i.display();
        System.out.println(o.y);

    }
}
