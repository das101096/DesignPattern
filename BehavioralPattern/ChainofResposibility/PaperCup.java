package BehavioralPattern.ChainofResposibility;

public class PaperCup implements Handler{
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void requestHandler(Request request) {
        int level = request.getLevel();
        System.out.println("Level : " + level + " : 종이컵 준비");
        request.setLevel(level+1);

        if(level < 3 && this.nextHandler != null) {
            this.nextHandler.requestHandler(request);
        }
    }
}
