package ExceptionHandlingPractice;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a Rectangle cannot be Negative.";
    }
}
public class ThrowVsThrows {

    static int area(int l, int b) throws NegativeDimensionException{
//        return l*b;
        // if the below doesn't have the throws exception, it will need to be handled.
        if (l < 0 || b < 0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }

    static void meth4() throws NegativeDimensionException{
        System.out.println(area(10,-5));
    }
    static int meth1(){
        // return 10/2;
        //unchecked exception below
        return 10/0;
    }
    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }
    public static void main(String[] args) throws NegativeDimensionException {
        // since the exception is not handled, this will cause the jvm to crash
        //meth3();

        // we are handling the exception here and printing the result
//        try{
//            meth3();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        try{
            meth4();
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
    }
}
