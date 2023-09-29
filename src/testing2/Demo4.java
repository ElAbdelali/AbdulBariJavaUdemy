package testing2;
import testing.Demo1;

public class Demo4 extends Demo1{
    public void show(){
        System.out.println(/*a+b+*/c+d);

        // different package, sub class
        // Following errors:
        // java: a is not public in testing.Demo1; cannot be accessed from outside package
        // java: b has private access in testing.Demo1
    }

}
