package ExceptionHandlingPractice;

public class Demo1 {
    public static void main(String[] args) {
        int a, b, c, d;
        try {
            a = 10;
            b = 0;
            d = 2;
            // c = a/b;
            c = a / d;
            System.out.println(c);
            System.out.println("End of Program, bye!");
        }catch(ArithmeticException e){
            System.out.println("Error: Division by Zero occured");
        }
    }
}
