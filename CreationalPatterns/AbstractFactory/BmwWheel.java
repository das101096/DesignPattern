package CreationalPatterns.AbstractFactory;

public class BmwWheel implements Wheel{
    @Override
    public void whoAmI() {
        System.out.println("Bmw Wheel");
    }
}
