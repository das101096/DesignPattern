package StructuralPatterns.Bridge;

public abstract class Theater {
    private AdmissionRules admissionRules;

    //생성자 주입을 통해 권한 위임
    public Theater(AdmissionRules admissionRules) {
        this.admissionRules = admissionRules;
    }

    public abstract Theater ruleForWho();

    // 머리, 복장 규칙을 확인하는 메서드는 AdmissionRules를 통해 실행
    public Theater hairRule() {
        admissionRules.hairRule();
        return this;
    }

    public Theater dressRule() {
        admissionRules.dressRule();
        return this;
    }
}
