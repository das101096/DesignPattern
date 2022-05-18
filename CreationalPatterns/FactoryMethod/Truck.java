package CreationalPatterns.FactoryMethod;

public class Truck implements Car{
    @Override
    public void whoAmI() {
        System.out.println("Truck");
    }
}
