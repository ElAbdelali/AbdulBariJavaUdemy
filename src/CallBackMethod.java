interface Member{
    void callback();
    public static void hello(){
        System.out.println("hi");
    }
}
class Store{
    Member[] member = new Member[100];
    int count = 0;
    void register(Member m){
        member[count++] = m;
    }
    void inviteSale(){
        for(int i = 0; i < count; i++){
            member[i].callback();
        }
    }
}
class Customerr implements Member{
    String name;
    Customerr(String n){
        name = n;
    }
    public void callback(){
        System.out.println("Ok. I will visit " + name);
    }

}
public class CallBackMethod {
    public static void main(String[] args) {
        Store s = new Store();
        Customerr c = new Customerr("Adrian");

        s.register(c);

        s.inviteSale();
        Member.hello();
    }
}
