package CreationalPatterns.FactoryMethod;

public abstract class CreatorCar {

    public Car createCar() {
        readyTemplate();
        assembleParts();
        return complete();
    }

    abstract protected void readyTemplate();
    private void assembleParts() {    System.out.println("2. 부품 조립");    }
    abstract protected Car complete();
}
