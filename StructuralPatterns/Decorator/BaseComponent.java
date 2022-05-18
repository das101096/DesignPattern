package StructuralPatterns.Decorator;

public class BaseComponent implements RamenComponent{
    @Override
    public String addSomething() {
        return "기본 라면";
    }
}
