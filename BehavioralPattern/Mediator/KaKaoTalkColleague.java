package BehavioralPattern.Mediator;

public class KaKaoTalkColleague extends Colleague{
    @Override
    public void action(String msg) {
        System.out.println("Send a " + msg + " to " + this);
    }
}
