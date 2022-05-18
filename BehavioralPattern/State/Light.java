package BehavioralPattern.State;

public class Light {
    private State state;

    public Light() {
        this.state = new OFF();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void ON() {
        state.ON(this);
    }

    public void OFF() {
        state.OFF(this);
    }
}
