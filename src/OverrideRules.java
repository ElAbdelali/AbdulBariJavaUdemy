//class A{
//    public A display(){
//        System.out.println("Super Display");
//        return new A();
//    }
//}
//
//
//class B extends A{
//
//}
class Superrrr
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");

    }
}

class Subsss extends Super
{
    //@Override if public
    // In order to overrid, the signature needs to be consistent
    // otherwise it would be overloading, not overloading

    // java is case sensitive so the method name should also be the same

    // the return type should be consistent or else it would be a whole new method given you return something

    // cannot override static or final methods
    // private, protected, and public
    // private > protected > public in terms of strict security/privacy
    public void display()
    {
        System.out.println("Sub diaplay.");

    }
}

public class OverrideRules {

    public static void main(String[] args) {

        Subsss s=new Subsss();

    }

}