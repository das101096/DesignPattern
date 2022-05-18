package BehavioralPattern.Observer;

public class Main {
    public static void main(String[] args) {
        Youtuber youtuber = new Youtuber();
        Observer subscriberA = new SubscriberA();
        Observer subscriberB = new SubscriberB();

        System.out.println("SubA 구독");
        youtuber.registerObserver(subscriberA);
        System.out.println("SubB 구독");
        youtuber.registerObserver(subscriberB);

        youtuber.notifyObservers("New video update");
    }
}
