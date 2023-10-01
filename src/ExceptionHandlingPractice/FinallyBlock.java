package ExceptionHandlingPractice;

public class FinallyBlock {
    public static void main(String[] args) throws Exception {
        //Both souts will print
        //However, if the sout is 10/0, the final message will not display
//        System.out.println(10/2);
//        System.out.println("Final Message");
        // to always display something, use the following:
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("Final Message");
        }


    }
}
