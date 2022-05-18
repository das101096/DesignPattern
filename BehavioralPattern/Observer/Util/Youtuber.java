package BehavioralPattern.Observer.Util;
import java.util.Observable;

public class Youtuber extends Observable {

    //별도의 메서드를 하나 구현
    //Observable 클래스는 동기화를 위해 changed 변수가 true 일 때만 notifyObservers() 메서드가 호출
    public void notifyEvent(String msg){
        setChanged();
        notifyObservers(msg);
    }
}
