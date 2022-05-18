package BehavioralPattern.Mediator;

public abstract class Colleague {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        mediator.setColleagues(this);
    }

    public void sendMsg(String msg) {
        mediator.mediate(msg);
    }

    public abstract void action(String msg);
}
