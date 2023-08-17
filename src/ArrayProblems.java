import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        // Find the sum of all elements in an array
        // Search for an element
        // Find maximum element
        // Find second-largest element

        int A[] = {1,2,3,4,5,6};
        int sum = 0;
        int max = A[0];
        int secondLargest = A[0];
        for (int x:A){
           sum+=x;
            System.out.println(sum);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find");
        int numToFind = scan.nextInt();

        for(int i = 0; i < A.length; i++){
            if(A[i] == numToFind){
                System.out.println(numToFind + " is found at index: " + i);
            }
        }

        for(int i = 0; i < A.length; i++){
            if (A[i] > max){
                max = A[i];
            }
        }
        System.out.println(max);

        for(int i = 0; i < A.length; i++){
            if (A[i] > max){
                secondLargest = max;
                max = A[i];
            }else if(A[i] > secondLargest && A[i] < max){
                secondLargest = A[i];
            }
        }
        System.out.println(secondLargest);
    }
}
