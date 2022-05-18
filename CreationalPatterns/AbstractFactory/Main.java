package CreationalPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Body benzbody = CarFactory.getBody(new BenzFactory());
        Wheel benzwheel = CarFactory.getWheel(new BenzFactory());
        benzbody.whoAmI();
        benzwheel.whoAmI();

        System.out.println();

        Body bmwbody = CarFactory.getBody(new BmwFactory());
        Wheel bmwwheel = CarFactory.getWheel(new BmwFactory());
        bmwbody.whoAmI();
        bmwwheel.whoAmI();
    }
}
