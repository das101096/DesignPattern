package CreationalPatterns.AbstractFactory;

public class BmwFactory implements CarAbstractFactory{
    @Override
    public Body createBody() {
        return new BmwBody();
    }

    @Override
    public Wheel createWheel() {
        return new BmwWheel();
    }
}
