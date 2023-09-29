package testing2;
import testing.Demo1;

public class test {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();

        d1.display();
        //System.out.println(d1.a+d1.b+d1.c+d1.d);
        //errors:
        //java: a is not public in testing.Demo1; cannot be accessed from outside package
        //java: b has private access in testing.Demo1
        //java: c has protected access in testing.Demo1
        // different package, non subclass
    }
}
