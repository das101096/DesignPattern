package CreationalPatterns.FactoryMethod;

public class Van implements Car{
    @Override
    public void whoAmI() {
        System.out.println("Van");
    }
}
