public class VarArgs {
    // all values being passed need to be of the same type
    // var args should always be the last param taken into account
    static void show(int...A){// same as int[]x but are read as individual params
        for(int x: A){
            System.out.println(x);
        }
    }
    static void showList(int start, String ...S){
        for(int i = 0; i < S.length; i++){
            System.out.println(start+". " + S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        show(1,2,3,4);
        show();
        show(9,13,75);
        show(new int[]{3, 5, 7, 9, 11, 13, 15}); // "Anonymous Array, no reference. Created on the fly and is deleted"
        showList(5, "John", "Smith", "Ajay");
    }
}
