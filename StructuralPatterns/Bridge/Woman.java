package StructuralPatterns.Bridge;

public class Woman extends Theater{

    public Woman(AdmissionRules admissionRules) {
        super(admissionRules);
    }

    @Override
    public Theater ruleForWho() {
        System.out.println("Rules for Woman");
        return this;
    }
}
