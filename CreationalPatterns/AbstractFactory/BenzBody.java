package CreationalPatterns.AbstractFactory;

public class BenzBody implements Body{
    @Override
    public void whoAmI() {
        System.out.println("Benz Body");
    }
}
