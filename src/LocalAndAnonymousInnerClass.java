// Writing classes within a method is useful when you want a class to inherit from a existing class
// or when you want to write a class that is implementing an interface

// Anonymous classes are useful for abstract classes and interfaces

interface Myy{
    public void show();
}
class Outerr {
    public void Display() {
//        class Inner{
//            public void innerDisplay(){
//                System.out.println("Hello");
//            }
//        }
//        Inner i = new Inner();
//        i.innerDisplay();
//        new Inner().innerDisplay(); // anonymous object
//        new Myy(){ public void show(){System.out.println("Hello"); }}.show();
        Myy m = new Myy(){ public void show(){System.out.println("Hello"); }};
        m.show();
    }
//    public void meth(){
//        Myy m = new Myy(){
//            public void display(){
//                System.out.println("Hello");
//            }
//        };
//        m.display();
//    }


}
public class LocalAndAnonymousInnerClass {
    public static void main(String[] args) {
        Outerr o = new Outerr();
        o.Display();
//        Outerr o = new Outerr();
//        o.Display();

    }
}
