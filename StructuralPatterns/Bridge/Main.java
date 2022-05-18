package StructuralPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Theater man = new Man(new ManRules());
        man.ruleForWho().hairRule().dressRule();

        System.out.println();

        Theater woman = new Woman(new WomanRules());
        woman.ruleForWho().hairRule().dressRule();
    }
}
