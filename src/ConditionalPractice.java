import java.util.Scanner;

public class ConditionalPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // find whether a number is odd or even



        System.out.print("Please enter a number: ");
        int evenOrOdd = scan.nextInt();
        if (evenOrOdd%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        // Find person is young or not young
        if (age < 18){
            System.out.println("Person is too young");
        }
        else {
            System.out.println("Person is not young");
        }
        System.out.print("Please enter your grade: ");
        int grade = scan.nextInt();
        if (grade > 90){
            System.out.println("A");
        }
        else if (grade >= 80 && grade < 90){
            System.out.println("B");
        }
        else if (grade >= 70 && grade < 80){
            System.out.println("C");
        }
        else if (grade >= 60 && grade < 70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }


    }
}
