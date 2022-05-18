package StructuralPatterns.Bridge;

public class ManRules implements AdmissionRules{
    @Override
    public void hairRule() {
        System.out.println("Man_HairRule");
    }

    @Override
    public void dressRule() {
        System.out.println("Man_dressRule");
    }
}
