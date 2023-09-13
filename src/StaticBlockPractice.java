class Sstatic{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}
public class StaticBlockPractice {

    public static void main(String[] args) {
        System.out.println("Main");
        Sstatic s = new Sstatic();

    }

}
