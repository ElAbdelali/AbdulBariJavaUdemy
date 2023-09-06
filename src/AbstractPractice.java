 abstract class AbstractExample{
//    public AbstractExample(){
//        System.out.println("Hello");
//    }
    public void meth1(){
        System.out.println("Method of Super");
    }
    abstract public void meth2();

    // Abstract classes are created for inheritance
     // abstract classes are used to define and impose standards
}

class AbstractExampleSubClass extends AbstractExample{
    @Override
    public void meth2(){
        System.out.println("hi");
    }
}
public class AbstractPractice {
    public static void main(String[] args) {
        AbstractExample s = new AbstractExampleSubClass();
        s.meth1();
        s.meth2();

    }
}
