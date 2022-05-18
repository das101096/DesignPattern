package StructuralPatterns.Proxy;

public class Proxy implements Subject{
    private Subject real;

    public Proxy(Subject real) {
        this.real = real;
    }

    @Override
    public void doAction1() {
        System.out.println("간단 업무 처리 by Proxy");
    }

    @Override
    public void doAction2() {
        //복잡 요청은 RealSubject에게 위임
        real.doAction2();
    }
}
