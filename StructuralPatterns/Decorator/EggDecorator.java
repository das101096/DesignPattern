package StructuralPatterns.Decorator;

public class EggDecorator extends AddDecorator{
    public EggDecorator(RamenComponent ramenComponent) {
        super(ramenComponent);
    }

    @Override
    public String addSomething() {
        return super.addSomething() + "Egg";
    }
}
