class CoffeeMachine
{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    static int counter = 0;
    static private CoffeeMachine my=null;

    private CoffeeMachine()
    {
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }

    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }

    static CoffeeMachine getInstance()
    {
        if(counter < 5){
            counter+=1;
            return new CoffeeMachine();
        }
        else{
            return null;
        }
    }


}
public class Singleton
{
    public static void main(String[] args)
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        CoffeeMachine m4=CoffeeMachine.getInstance();
        CoffeeMachine m5=CoffeeMachine.getInstance();
        CoffeeMachine m6=CoffeeMachine.getInstance();
        CoffeeMachine m7=CoffeeMachine.getInstance();

        System.out.println(m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+m6+" "+m7);
        if(m1==m2 && m1==m3)
            System.out.println("Same");

    }
}