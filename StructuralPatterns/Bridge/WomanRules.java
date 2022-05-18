package StructuralPatterns.Bridge;

public class WomanRules implements AdmissionRules{
    @Override
    public void hairRule() {
        System.out.println("Women_hairRule");
    }

    @Override
    public void dressRule() {
        System.out.println("Women_dressRule");
    }
}
