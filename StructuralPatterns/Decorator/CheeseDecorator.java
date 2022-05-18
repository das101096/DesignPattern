package StructuralPatterns.Decorator;

public class CheeseDecorator extends AddDecorator{
    public CheeseDecorator(RamenComponent ramenComponent) {
        super(ramenComponent);
    }

    @Override
    public String addSomething() {
        return super.addSomething() + "Cheese";
    }
}
