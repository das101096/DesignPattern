package StructuralPatterns.Proxy;

public class RealSubject implements Subject{
    @Override
    public void doAction1() {
        System.out.println("간단 업무처리 by Real");
    }

    @Override
    public void doAction2() {
        System.out.println("복잡 업무처리 by Real");
    }
}
