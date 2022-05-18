package BehavioralPattern.Memento;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Stack<Memento> mementos = new Stack<>();

        originator.setState("A");
        mementos.push(originator.createMemento());

        originator.setState(originator.getState()+"B");
        mementos.push(originator.createMemento());

        originator.setState(originator.getState()+"C");
        mementos.push(originator.createMemento());

        originator.setState(originator.getState()+"D");
        mementos.push(originator.createMemento());

        while (!mementos.isEmpty()) {
            originator.restoreMemonto(mementos.pop());
            System.out.println(originator.getState());
        }
    }
}
