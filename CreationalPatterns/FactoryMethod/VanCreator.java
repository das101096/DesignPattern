package CreationalPatterns.FactoryMethod;

public class VanCreator extends CreatorCar{
    @Override
    protected void readyTemplate() {
        System.out.println("1. Van 틀을 준비");
    }

    @Override
    protected Car complete() {
        System.out.println("3. Van 완성");
        return new Van();
    }
}
