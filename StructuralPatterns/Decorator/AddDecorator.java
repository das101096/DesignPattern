package StructuralPatterns.Decorator;

abstract public class AddDecorator implements RamenComponent{
    private RamenComponent ramenComponent;

    public AddDecorator(RamenComponent ramenComponent) {
        super();
        this.ramenComponent = ramenComponent;
    }

    @Override
    public String addSomething() {
        return ramenComponent.addSomething();
    }
}
