import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // three parts to a for loop
        //1. initialization, 2. condition, 3. "updation"
        // initialization. conditional, and updation are all optional, as long as the variable exists

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        for (int j = 10; j >=0; j--){
            System.out.println(j);
        }

        for (int k=0, l=0; k<10; k++, l=l+1*2){
            System.out.println(k+" " + l);
        }
        int m = 5;
        for (int n = 1; n <= 100; n++){
            System.out.println(m + "*" + n + "=" + (n*m) );
        }

        System.out.println("Provide me with a number");
        int num = scan.nextInt();
        int sumOfNum = 0;

        for (;num>0;num--){
            sumOfNum = sumOfNum + num;
            System.out.println(sumOfNum);
        }


    }
}
