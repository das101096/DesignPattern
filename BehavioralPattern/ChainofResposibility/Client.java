package BehavioralPattern.ChainofResposibility;

public class Client {
    public static void main(String[] args) {
        PaperCup first = new PaperCup();
        Coffee second = new Coffee();
        HotWater third = new HotWater();

        first.setNextHandler(second);
        second.setNextHandler(third);

        first.requestHandler(new Request());
    }
}
