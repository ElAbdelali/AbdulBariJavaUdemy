public class EvenMoreArrayPractice {
    public static void main(String[] args) {
        // 1. Copying an Array
        // 2. Reverse Copying an Array
        // 3. Increasing Size of Array (Once an array is created, it cannot increase in size)


        int arrayToBeCopied[] = {1,2,3,4,5,6};
        int arrayCopying[] = new int[6];
        int arrayReverseCopying[] = new int[6];
        int arrayDoubled[] = new int[12];

        for (int i = 0; i < arrayToBeCopied.length; i++){
            arrayCopying[i] = arrayToBeCopied[i];
        }
        for (int i = 0; i < arrayCopying.length; i++){
            System.out.print(arrayCopying[i] + " ");
        }

        for (int i = arrayToBeCopied.length-1, j = 0; i >= 0; i--, j++){
                arrayReverseCopying[j] = arrayToBeCopied[i];
        }
        for (int i = 0; i < arrayReverseCopying.length; i++){
            System.out.print(arrayReverseCopying[i] + " ");
        }
        for(int i = 0; i < arrayToBeCopied.length; i++){
                arrayDoubled[i] = arrayToBeCopied[i];
        }
        for(int x: arrayDoubled){
            System.out.print(x+" ");
        }
    }
}
