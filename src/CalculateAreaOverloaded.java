public class CalculateAreaOverloaded {

    // method for rectangle
    static int area(int width, int length){
        return width * length;
    }

    // method for triangle
    static double area(double height, double base){
        return (height * base)/2;
    }

    // method for square
    static int area(int side){
        return side * side;
    }
    // method for circle
    static double area(double radius){
        return radius * radius * Math.PI;
    }
    // method for reversing an int
    static int reverse(int num){
        int holder = 0;

        while (num != 0){
            holder = holder * 10 + num%10;
            num/=10;
        }
        return holder;
    }
    // method for reversing an array
    static int[] reverse(int[] array){
        int reversedArray[] = new int[array.length];
        for (int i = 0, j=array.length - 1; i < array.length; i++, j--){
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    static boolean validate(String name){

       return name.matches("[a-zA-Z\\s]+");

    }
    static boolean validate(int age){
        if (age > 4 && age <= 18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
//        int rectangleArea = area(4,6);
//        double triangleArea = area(21, 11);
//        int squareArea = area(12);
        int[] array = {1, 2, 3, 4};
        int[] reversedArray = reverse(array);

        System.out.println(area(4,6));
        System.out.println(area(21.0, 11));
        System.out.println(area(12));
        System.out.println(area(12.3));
        System.out.println(reverse(123));
        for (int i = 0; i < array.length; i++){
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println(validate(28));
        System.out.println(validate("Ali"));
    }
}
