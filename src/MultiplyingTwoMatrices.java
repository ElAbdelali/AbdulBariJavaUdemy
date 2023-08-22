public class MultiplyingTwoMatrices {
    public static void main(String[] args) {
        int A[][] = {{3,5,9}, {7,6,2}, {4,3,5}};
        int B[][] = {{1,5,2}, {6,8,4}, {3,9,7}};
        int C[][] = new int[A.length][B[0].length];

        if (A[0].length != B.length){
            System.out.println("Matrix Multiplication is not possible.");
            return;
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int sum = 0;
                C[i][j] = 0;
                for(int k = 0; k<3; k++){
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        for (int X[]:C){
            for(int y: X){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
