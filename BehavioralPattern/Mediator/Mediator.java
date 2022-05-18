package BehavioralPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagues;

    public Mediator() {
        colleagues = new ArrayList<>();
    }

    public void setColleagues(Colleague colleague) {
        colleagues.add(colleague);
    }
    public abstract void mediate(String msg);
}
