package ExceptionHandlingPractice;
import java.io.*;

// Defining our own exception class below:

class LowBalanceException extends Exception{
    public String toString(){
        return "Balance Should not be less than 5000";
    }
}
public class CheckedAndUncheckedExceptions {
    static void fun1(){
        // Below is an example of an Unchecked Exception which will cause the program to crash
        //System.out.println(10/0);

        // Below is an example of a Checked Exception which must be handled or the compiler will force you to handle it.
        //FileInputStream fi = new FileInputStream("myfile.txt");

        // throwing new exception and handling it
        try{
            throw new LowBalanceException();
        }catch(LowBalanceException e){
            System.out.println(e);
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
