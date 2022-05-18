package StructuralPatterns.Adapter.apply;

public class Volt110 implements ConnectAdapter{
    @Override
    public void voltConnect() {
        System.out.println("110V 전용");
    }
}
