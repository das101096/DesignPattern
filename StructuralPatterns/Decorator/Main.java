package StructuralPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        RamenComponent baseRamen = new BaseComponent();
        System.out.println("B Ramen : " + baseRamen.addSomething());

        RamenComponent baseEggRamen = new EggDecorator(new BaseComponent());
        System.out.println("B Ramen with Egg : " + baseEggRamen.addSomething());

        RamenComponent baseCheeseRamen = new CheeseDecorator(new BaseComponent());
        System.out.println("B Ramen with Cheese : " + baseCheeseRamen.addSomething());

        RamenComponent baseEggCheeseRamen = new CheeseDecorator(new EggDecorator(new BaseComponent()));
        System.out.println("B Ramen with Cheese Egg : " + baseEggCheeseRamen.addSomething());

    }
}
