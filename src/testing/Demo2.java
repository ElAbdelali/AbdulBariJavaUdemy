package testing;

public class Demo2 {
    Demo1 d = new Demo1();
    public void show(){
        System.out.println(d.a/*+d.b*/+d.c+d.d);

        //error: java: b has private access in testing.Demo1
        //same package, not a subclass
    }
}
