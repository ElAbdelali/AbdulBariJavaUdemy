interface Test {
    void meth1();
    void meth2();
}

class My implements Test{
    public void meth1(){
        System.out.println("hi");
    }
    public void meth2(){
        System.out.println("hello");
    }
    public void meth3(){
        System.out.println("hola");
    }
}
public class InterfacePractice{
    public static void main(String[] args) {
        Test t = new My(); // achieving runtime polymorphism
        // dynamic method dispatch

        t.meth1();
        t.meth2();


    }
}