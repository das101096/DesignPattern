package BehavioralPattern.State;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        light.OFF();
        light.ON();
        light.ON();
        light.OFF();
    }
}
