class Car{
    public void start(){
        System.out.println("Car started");
    }
    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear Changed");
    }
}
class LuxuryCar extends Car{
    @Override
    public void changeGear(){
        System.out.println("Automatic gear");
    }
    public void openRoof(){
        System.out.println("Roof is open");
    }
}

public class CarMethodOverRiding {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();
        Car b = new LuxuryCar();

        b.start();
        //b.openRoof(); can't call this because the method is not available in superclass
        b.accelerate();
        b.changeGear();

    }

}
