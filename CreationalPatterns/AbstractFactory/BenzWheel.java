package CreationalPatterns.AbstractFactory;

public class BenzWheel implements Wheel{
    @Override
    public void whoAmI() {
        System.out.println("Benz Wheel");
    }
}
