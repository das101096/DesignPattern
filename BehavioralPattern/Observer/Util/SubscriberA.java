package BehavioralPattern.Observer.Util;
import java.util.Observable;
import java.util.Observer;

public class SubscriberA implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.getClass() + " : " + arg);
    }
}
