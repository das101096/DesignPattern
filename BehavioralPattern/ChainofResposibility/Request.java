package BehavioralPattern.ChainofResposibility;

public class Request {
    private int level;

    public Request() {
        this.level = 1;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int count) {
        this.level = count;
    }
}
