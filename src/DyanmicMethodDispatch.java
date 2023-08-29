class SuperClass{
    public void method1(){
        System.out.println("meth 1 super");
    }
    public void method2(){
        System.out.println("meth 2 super");
    }

}
class SubClass extends SuperClass{
    @Override
    public void method2(){
        System.out.println("nethod 2 sub");
    }
    public void method3(){
        System.out.println("meth 3 sub");
    }
}
public class DyanmicMethodDispatch {
    public static void main(String[] args) {
//        SubClass s = new SubClass();
//
//        s.method1();
//        s.method2();
//        s.method3();
        SuperClass s = new SubClass();

        // SubClass s = new SuperClass(); This is not allowed

        s.method1();
        s.method2();
    }
}
