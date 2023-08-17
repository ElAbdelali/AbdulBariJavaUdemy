public class MoreArrayPractice {
    public static void main(String[] args) {
        // 1. Rotate an Array

        int arrayToBeRotated[] = {1, 2, 3, 4, 5, 6, 7};
        int temp = arrayToBeRotated[0];

        for(int i = 0; i < arrayToBeRotated.length - 1; i++){
            arrayToBeRotated[i] = arrayToBeRotated[i+1];
        }
        arrayToBeRotated[arrayToBeRotated.length - 1] = temp;
        for(int i = 0; i < arrayToBeRotated.length; i++){
            System.out.println(arrayToBeRotated[i]);
        }
        // 2. Insert an Element into an Array
        // Insertion is possible only if free spaces within the array are available

        int arrayToBeInserted[] = new int[10];
        arrayToBeInserted[0] = 5;
        arrayToBeInserted[1] = 9;
        arrayToBeInserted[2] = 6;
        arrayToBeInserted[3] = 10;
        arrayToBeInserted[4] = 12;
        arrayToBeInserted[5] = 7;
        int n = 6;
        int x = 15;
        int index = 2;

        for(int i = 0; i < n; i++){
            System.out.print(arrayToBeInserted[i] + ",");
        }
        for(int i = n; i > index; i--){
            arrayToBeInserted[i] = arrayToBeInserted[i-1];
        }
        System.out.println("");
        arrayToBeInserted[index] = x;
        for(int i = 0; i < n + 1; i++){
            System.out.print(arrayToBeInserted[i] + ",");
        }
        System.out.println();

        // 3. Delete an Element from an Array
        // Make sure an index is valid
        // Once an element is deleted, we need to shift the remaining elements
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int itd = 2;
        array[itd] = 0;

        for (int i = itd; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        for (int i = 0; i < array.length-1; i++){
            System.out.println(array[i]);
        }
    }

}
