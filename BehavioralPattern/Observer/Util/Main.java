package BehavioralPattern.Observer.Util;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Youtuber youtuber = new Youtuber();
        Observer subscriberA = new SubscriberA();
        Observer subscriberB = new SubscriberB();

        System.out.println("SubA 구독");
        youtuber.addObserver(subscriberA);
        System.out.println("SubB 구독");
        youtuber.addObserver(subscriberB);

        youtuber.notifyEvent("New video update");
    }
}
