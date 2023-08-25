class Rrectangle{
    int length;
    int breadth;
    Rrectangle(){
        length=breadth=1;
    }
    Rrectangle(int l, int b){
        length = l;
        breadth = b;
    }
}

class Cuboidd extends Rrectangle{
    int height;
    Cuboidd(){
        height = 1;
    }
    Cuboidd(int h){
        height=h;
    }
    Cuboidd(int l, int b, int h){
        super(l,b);
        height = h;
    }
    int volume(){
        return length*breadth*height;
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        //Cuboidd c = new Cuboidd();
        //Cuboidd c = new Cuboidd(10);
        Cuboidd c = new Cuboidd(5,3,10);
        System.out.println(c.volume());
    }
}
