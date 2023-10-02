package ExceptionHandlingPractice;
import java.io.*;
import java.util.*;


public class TryWithResources {
    static FileInputStream fi;
    static void Divide() throws Exception{
        try (FileInputStream fi = new FileInputStream("/Users/abdelalieljaouhari/Documents/AbdulBarisJavaCoursePracticeProblems/src/ExceptionHandlingPractice/test.txt");Scanner scan = new Scanner(fi)){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(a / c);
        }
    }
    public static void main(String[] args) throws Exception{

        try{
            Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }

        // int x = scan.nextInt();
        // System.out.println(x);


    }
}
