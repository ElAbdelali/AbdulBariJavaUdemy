public class TwoDimensionalArray {
    public static void main(String[] args) {
        //syntax
        //Ways of creating a 2d array
        //int a[][] = new int[3][4];
        // int a[][];
        // a = new int[3][4]
        int a[][] = {{1,2,3,4}, {2,4,6,8}, {3,5,7,9}};

        // "Collection of arrays"
        // how to traverse a 2d array

        for ( int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        // for each loop
        for ( int x[]: a){
            for (int y: x){
                System.out.print(y);
            }
            System.out.println("");
        }

        // "Jagged array" - WHen the number of elements within a 2d array are not consistent
        int b[][]; // initializing a new array
        b = new int[3][]; // providing the new array with 3 references
        b[0] = new int[2]; // assigning the number of columns
        b[1] = new int[4]; //
        b[2] = new int[3];




    }
}
