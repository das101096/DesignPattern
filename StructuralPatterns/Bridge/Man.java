package StructuralPatterns.Bridge;

public class Man extends Theater{

    public Man(AdmissionRules admissionRules) {
        super(admissionRules);
    }

    @Override
    public Theater ruleForWho() {
        System.out.println("Rules for Man");
        return this;
    }
}
