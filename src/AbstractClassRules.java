abstract class Superx{
    // must declare the class abstract if the methods are abstract
    // abstract classes cannot be final because this will mean it cannot be extended
    // Abstract methods cannot be final because this will mean it won't be able to be overridden
    // Abstract Classes and methods cannot be static
    abstract public void meth1();
}
class Subx extends Superx{
    @Override
    public void meth1(){
        System.out.println("hi");
    }
}


public class AbstractClassRules {
    public static void main(String[] args) {
        // We can create a reference of Abstract Class Superx, but not an object as it is an abstract class

        Superx s;
        // The code to the right of this will throw an error Superx n = new Superx();


    }
}
