public class MethodPracticeExercises {
    // check whether a number is prime or not
    static boolean isPrime(int num){
        for(int i = 2; i < 10; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    // find the greatest common divisor between two nums
    static int gcd(int num, int num2){
        while (num != num2) {
            if(num > num2){
                num-=num2;
            }
            else {
                num2-=num;
            }
        }
        return num;
    }
    // Find the Max element in an array

    static int greatestElement(int[] array){
        int value = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > value){
                value = array[i];
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int primeOrNot = 91;
        int[] array = {1,2,3,9,5,11};
        System.out.println(gcd(95,15));
        System.out.println(isPrime(primeOrNot));
        System.out.println(greatestElement(array));
    }
}
