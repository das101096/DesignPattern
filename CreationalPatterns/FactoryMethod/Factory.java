package CreationalPatterns.FactoryMethod;

public class Factory {
    public Car createCar(Car car) {
        if(car instanceof Truck) {
            return new TruckCreator().createCar();
        } else if(car instanceof Van) {
            return new VanCreator().createCar();
        }
        return null;
    }
}
