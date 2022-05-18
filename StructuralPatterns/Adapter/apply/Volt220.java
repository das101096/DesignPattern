package StructuralPatterns.Adapter.apply;

public class Volt220 implements ConnectAdapter{
    @Override
    public void voltConnect() {
        System.out.println("220V 전용");
    }
}
