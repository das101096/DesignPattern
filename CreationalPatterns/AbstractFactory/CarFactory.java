package CreationalPatterns.AbstractFactory;

public class CarFactory {
    public static Body getBody(CarAbstractFactory carAbstractFactory) {
        return carAbstractFactory.createBody();
    }

    public static Wheel getWheel(CarAbstractFactory carAbstractFactory) {
        return carAbstractFactory.createWheel();
    }
}
