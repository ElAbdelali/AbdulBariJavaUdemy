public class Recursion {
    // Java supports Recursive methods
    // However, it is usually used

    // Recursive Methods call themselves within the method
    static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
    void funner(int n){
        if(n>0){
            fun(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        fun(30);
    }

}
