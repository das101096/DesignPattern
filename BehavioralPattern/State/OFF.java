package BehavioralPattern.State;

public class OFF implements State{
    @Override
    public void ON(Light light) {
        System.out.println("Power ON");
        light.setState(new ON());
    }

    @Override
    public void OFF(Light light) {
        System.out.println("Nothing Happens");
    }
}
