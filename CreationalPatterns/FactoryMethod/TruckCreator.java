package CreationalPatterns.FactoryMethod;

public class TruckCreator extends CreatorCar{
    @Override
    protected void readyTemplate() {
        System.out.println("1. Truck 틀 준비");
    }

    @Override
    protected Car complete() {
        System.out.println("3. Truck 완성");
        return new Truck();
    }
}
