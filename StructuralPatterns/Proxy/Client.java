package StructuralPatterns.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject proxy = new Proxy(new RealSubject());
        proxy.doAction1();
        proxy.doAction2();
    }
}
