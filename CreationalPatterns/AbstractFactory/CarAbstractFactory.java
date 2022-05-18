package CreationalPatterns.AbstractFactory;

public interface CarAbstractFactory {
    public Body createBody();
    public Wheel createWheel();
}
