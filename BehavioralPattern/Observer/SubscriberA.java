package BehavioralPattern.Observer;

public class SubscriberA implements Observer{
    @Override
    public void notifySubscriber(String msg) {
        System.out.println(this.getClass() + " : " + msg);
    }
}
