public class MethodOverloadingPractice {
    // What is method overloading?
    // Same name, different params/return type ie int, float, etc.

    static int max(int x, int y){
        return x > y ? x : y;
    }
    static float max(float x, float y){
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 15));
        System.out.println(max(10.5f, 11.6f));;
    }
}
