package testing;

public class Demo3 extends Demo1 {
    public void show(){
        System.out.println(a+/*b+*/c+d);
        // error: java: b has private access in testing.Demo1
        // same package, subclass
    }
}
