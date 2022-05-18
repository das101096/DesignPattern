package CreationalPatterns.SingleTon;

public class SingleTon {
    private static SingleTon instance = new SingleTon();

    private SingleTon() {    }

    public static SingleTon getInstance() {
        if(instance == null) {
            synchronized (SingleTon.class) {
                if(instance == null)
                    instance = new SingleTon();
            }
        }
        return instance;
    }
}
