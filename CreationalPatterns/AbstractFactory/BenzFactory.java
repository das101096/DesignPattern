package CreationalPatterns.AbstractFactory;

public class BenzFactory implements CarAbstractFactory{
    @Override
    public Body createBody() {
        return new BenzBody();
    }

    @Override
    public Wheel createWheel() {
        return new BenzWheel();
    }
}
