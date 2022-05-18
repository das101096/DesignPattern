package BehavioralPattern.State;

public class ON implements State{
    @Override
    public void ON(Light light) {
        System.out.println("Nothing Happens");
    }

    @Override
    public void OFF(Light light) {
        System.out.println("Power OFF");
        light.setState(new OFF());
    }
}
