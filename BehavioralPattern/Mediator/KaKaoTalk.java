package BehavioralPattern.Mediator;

public class KaKaoTalk extends Mediator{
    @Override
    public void mediate(String msg) {
        for (Colleague colleague : colleagues) {
            colleague.action(msg);
        }
    }
}
