public class Patterns {
    public static void main(String[] args) {
//        int count = 0;
        for(int i = 1; i <=4; i++){
            for (int j = 1; j<=4; j++){
//                System.out.print("("+j+","+i+")"+" ");
//                System.out.printf("%02d ", ++count);
//                System.out.printf("%02d ", j);
//                System.out.printf("%02d ", ++count);
//                System.out.printf("%d ", j);

//                if (i+j > 5){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
                if(i<=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            for(int k = 1; k <= 3; k++){
                if (k+i<5){
                    System.out.print("*");
                }else{
                    System.out.println(" ");
                }

            }
            System.out.println();
        }

    }
}
