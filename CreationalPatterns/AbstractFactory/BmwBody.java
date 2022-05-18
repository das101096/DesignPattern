package CreationalPatterns.AbstractFactory;

public class BmwBody implements Body{
    @Override
    public void whoAmI() {
        System.out.println("Bmw Body");
    }
}
