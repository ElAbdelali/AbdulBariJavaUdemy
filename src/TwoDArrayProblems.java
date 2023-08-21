public class TwoDArrayProblems {
    public static void main(String[] args) {

        int A[][] = new int[5][5];
        int B[][] = {{1, 2, 3}, {2, 4, 6}, {1, 3, 5}};
        int C[][];
        C = new int[5][5];
        int [][]D = new int[5][5];
        // can also do []D[]
        int[] E,F[]; // two arrays E is one dimensional, f is two.

        E = new int[5];
        F = new int[5][5];
        int Z[][];
        // jagged array example
        Z = new int[3][];
        Z[0] = new int[5];
        Z[1] = new int[3];
        Z[2] = new int[8];

        for(int i = 0; i < B.length; i++){
            for(int j=0; j < B[0].length; j++){
                System.out.print(B[i][j]+ " ");
            }
            System.out.println();
        }
    // for each loop
        for (int X[]:B){
            for (int y: X) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < Z.length; i++){
            for (int j = 0; j < Z[i].length; j++){
                System.out.print( Z[i][j] + " ");
            }
            System.out.println();
        }

        //for each example of the above for loop
        for (int x[]: Z){
            for (int y:x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
