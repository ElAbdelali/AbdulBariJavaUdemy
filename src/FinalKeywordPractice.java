class FinalPractice{ // if class was final, it will not be able to be inherited
    final int MIN = 1;
    static final int NORMAL;
    final int MAX;

    static{
        NORMAL = 5;
    }
    FinalPractice(){
        MAX = 10;
    }
    public final void show(){
        System.out.println("Hello");
    }
}
class test3 extends FinalPractice{
    // public void show(){} // cannot override final methods
}
// cannot override/redefine final methods
// final classes cannot be extended/inherited
public class FinalKeywordPractice {

    final float PI;
    {
        PI = 3.1425f; // can initialize in instance block, constructor or when declaring the variable
    }
    public static void main(String[] args) {

    }
}
