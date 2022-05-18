package CreationalPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car = factory.createCar(new Truck());
        car.whoAmI();

        car = factory.createCar(new Van());
        car.whoAmI();
    }
}
