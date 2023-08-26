class Super{
    public void display(){
        System.out.println("Hello");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Hello Welcome");
    }
}
public class MethodOverriding {
    // Method overriding = Redefining a superclass method within a subclass.
    // Method overloading = Same method, different parameters.
    public static void main(String[] args) {
        Super sssuper = new Super();
        Sub sub = new Sub();
        sssuper.display();
        sub.display();
        Super su = new Sub();
        su.display();
    }




}
